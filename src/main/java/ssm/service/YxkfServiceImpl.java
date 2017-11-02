package ssm.service;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ssm.model.HotelguestMapper;
import ssm.model.YxkfMapper;
import ssm.pojo.HotelCount;
import ssm.pojo.Hotelguest;
import ssm.pojo.Yxkf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
@Service
public class YxkfServiceImpl implements YxkfService {

    @Autowired
    private HotelguestMapper hotelguestMapper;

    @Autowired
    private YxkfMapper yxkfMapper;

    @Value("${yuleMonth}")
    private Integer month;
    @Value("${time}")
    private Integer hour;



    public void saveYxkf_history() {
        Long a=System.currentTimeMillis();

        //获取month个月的天数
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -month);
        //遍历循环,按照month个月的每天的男、女开房记录来匹配对应信息
        int day=(int)((System.currentTimeMillis()-calendar.getTimeInMillis())/86400000);
        for(int i=1;i<day+1;i++){
            List<Hotelguest> guests = hotelguestMapper.get_history(i);
            mateAndSaveyxkf(guests);//对男女数据进行匹配,并且存储到yxkf表中
            System.out.println(new DateTime().toString("yyyy-MM-dd HH:mm:ss")+">>>>>>>>第"+i+"天数据处理完毕,耗时:"+(System.currentTimeMillis()-a)/1000.0+"秒");
            a=System.currentTimeMillis();
        }

    }

    public void saveYxkf_update(){
       /* List<Hotelguest> guests = hotelguestMapper.get_history(hour);
        mateAndSaveyxkf(guests);//对男女数据进行匹配,并且存储到yxkf表中*/
    }

    public void mateAndSaveyxkf(List<Hotelguest> guests) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
        //对男女数据对比,匹配是否异性开房并且存储到yxkf记录中
        for(Hotelguest m:guests){
            for(Hotelguest n:guests){
                if(m.getXb()==n.getXb()){
                    continue;
                }
                if(m.getZklsh()==n.getZklsh()){
                    continue;
                }
                if(m.getLgmc().equals(n.getLgmc())&&
                        m.getFh().equals(n.getFh())){//地点核对(宾馆+房号)
                    try {
                        if(format.parse(m.getRzsj()).getTime()-format.parse(n.getRzsj()).getTime()<600000&&
                                format.parse(m.getRzsj()).getTime()-format.parse(n.getRzsj()).getTime()>-600000){//时间核对(开房时间相差10分钟以内)
                            if(!m.getXm().substring(0, 1).equals(n.getXm().substring(0,1))){//同姓男女数据排除
                                Yxkf yxkf = new Yxkf();
                                //begin--将数据封装到Yxkf中
                                yxkf.setCjsj(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
                                yxkf.setId(0);
                                yxkf.setLgbm(m.getLgbm());
                                yxkf.setLgmc(m.getLgmc());
                                yxkf.setFh(m.getFh());
                                yxkf.setXm(m.getXm());
                                yxkf.setZjhm(m.getZjhm());
                                yxkf.setZklsh(m.getZklsh());
                                yxkf.setRzsj(m.getRzsj());
                                yxkf.setJg(m.getJg());
                                yxkf.setZz(m.getZz());
                                yxkf.setXb(m.getXb());
                                yxkf.setMz(m.getMz());
                                yxkf.setCsrq(m.getCsrq());
                                yxkf.setZjlx(m.getZjlx());
                                yxkf.setYx_xm(n.getXm());
                                yxkf.setYx_zklsh(n.getZklsh());
                                yxkf.setYx_zjhm(n.getZjhm());

                                /**
                                 * 目前缺少前科数据
                                //查询异性前科表中是否存在
                                int i=qianke.findByZjhm();
                                if(i>0){
                                    //存在即为卖淫
                                    yxkf.setYx_type(1);
                                }else{
                                    //否则为非卖淫
                                    yxkf.setYx_type(0);
                                }
                                */

                                //end--将数据封装到Yxkf中
                                //System.out.println(Yxkf);
                                yxkfMapper.save(yxkf);
                                //将匹配数据存储到yxkf表中
                                break;
                            }
                        }
                    } catch (ParseException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}
