package ssm.service;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ssm.model.*;
import ssm.pojo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class YuleServiceImpl implements YuleService{

    @Autowired
    private EntertainpersonMapper entertainpersonMapper;
    @Autowired
    private HotelCountMapper hotelCountMapper;

    @Autowired
    private HotelguestMapper hotelguestMapper;

    @Autowired
    private YxkfMapper yxkfMapper;

    @Autowired
    private YuleMapper yuleMapper;

    @Value("${time}")
    private Integer time;

    @Value("${yuleMonth}")
    private Integer month;

    @Value("${yuleYxRs}")
    private Integer yxrs;




    public String condition1() {
        //获取娱乐从业人员entertainperson的list
        //遍历list
        //根据entertainperson.idnum去查询hotel_count表中对应数据
        //如果存在数据,进行数据整理并且存入yule表中
        List<Entertainperson> list = entertainpersonMapper.find();
        for(Entertainperson enter:list){
            //System.out.println(enter);
            List<HotelCount> hotelCounts = hotelCountMapper.findByRzsj_hostory(month, "0607", enter.getIdnum());
            if(hotelCounts.toString()!="[]"){
                HotelCount hotelCount=hotelCounts.get(0);
                // System.out.println(hotelCount);
                Yule yule = dateToYule(enter, hotelCount);
                //System.out.println(yule);
                yuleMapper.save(yule);
                System.out.println(yule);
                System.out.println("存存存");
            }
        }
        //System.out.println("存储完毕");
        return "存储完毕";
    }




    public String condition2() {
        //查找6个月内与1名以上异性开房的住客zjhms
        List<ZjAndCount> zcs = yxkfMapper.getZjhm(month, yxrs);
        System.out.println(zcs);
        //查找娱乐从业人员zjhm
        List<Entertainperson> ents = entertainpersonMapper.find();
        //遍历匹配
        for(ZjAndCount zc:zcs){
                boolean flag=false;
                Yule yule=new Yule();
                Yx[]yxs=new Yx[zc.getCount()];

                for(Entertainperson ent:ents){
                    if(zc.getZjhm().equals(ent.getIdnum())){
                        yule.setCydz(ent.getUnit_name());
                        flag=true;
                        System.out.println("1:"+zc.getZjhm());
                        System.out.println("2:"+ent.getIdnum());
                        break;
                    }
                }


                if(flag){

                    System.out.println("zc:"+zc);
                    int index=1;
                    List<Yxkf> yxkfs = yxkfMapper.getMessByZjhm(zc.getZjhm(), month);
                    for(int i=0;i<yxkfs.size();i++) {
                        Yxkf yxkf = yxkfs.get(i);
                        //System.out.println("yxkf:"+yxkf);
                        Yx yx = new Yx();
                        if (i == 0) {
                            //System.out.println(yxkfs.get(0));
                            yule.setCjsj(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
                            yule.setXm(yxkf.getXm());
                            //System.out.println(yxkf.getXm());
                            yule.setZjhm(yxkf.getZjhm());
                            yule.setZz(yxkf.getZz());
                            yule.setXb(yxkf.getXb());
                            yule.setMz(yxkf.getMz());
                            yule.setCsrq(yxkf.getCsrq());
                            yule.setZjlx(yxkf.getZjlx());
                            yule.setJg(yxkf.getJg());
                            yule.setType(2);
                            yule.setLast_rzsj(yxkf.getRzsj());
                            yule.setLast_lgmc(yxkf.getLgmc());
                            yule.setLast_lgbm(yxkf.getLgbm());
                            yule.setLast_fh(yxkf.getFh());
                            yule.setCount(zc.getCount());
                            yx.setCount(1);
                            yx.setKfjl(yxkf.getYx_zklsh());
                            if(yxkf.getYx_type()!=null) {
                                yx.setType(yxkf.getYx_type());
                            }
                            yx.setXm(yxkf.getYx_xm());
                            yx.setZjhm(yxkf.getYx_zjhm());
                            yxs[0] = yx;
                            System.out.println("0进来的数据:"+yxkf);
                            System.out.println("数据进来了");
                        } else {
                            //System.out.println("i:"+i+";OK");
                            int num = -1;
                            for (int n = 0; n < yxs.length; n++) {
                                if (yxs[n]!=null&&yxs[n].getZjhm().equals(yxkf.getYx_zjhm())) {
                                    num = n;
                                    break;
                                }
                            }
                            if(num!=-1){
                                yx.setXm(yxs[num].getXm());
                                yx.setZjhm(yxs[num].getZjhm());
                                yx.setType(yxs[num].getType());
                                yx.setCount(yxs[num].getCount()+1);
                                yx.setKfjl(yxs[num].getKfjl()+","+yxkf.getYx_zklsh());
                                yxs[num]=yx;
                            }else{
                                yx.setXm(yxkf.getYx_xm());
                                yx.setKfjl(yxkf.getYx_zklsh());
                                yx.setCount(1);
                                yx.setType(2);
                                yx.setZjhm(yxkf.getYx_zjhm());
                                System.out.println("length:"+yxs.length);
                                System.out.println("index:"+index);
                                System.out.println(index+":"+yxkf);
                                System.out.println("zjhm:"+yxkf.getYx_zjhm());
                                yxs[index] = yx;
                                index++;
                            }
                    }

                    }
                    yule.setMessage(Arrays.toString(yxs));
                    System.out.println(yule);

                    yuleMapper.save(yule);
                }

            }
            //整理数据 存入Yule表中 type=2

        return "Yule条件2数据存储完毕";
    }


    public Yule dateToYule(Entertainperson enter,HotelCount hotelCount){
        Yule yule = new Yule();
        yule.setCjsj(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
        yule.setCjsj(hotelCount.getCjsj());
        yule.setXm(hotelCount.getXm());
        yule.setZjhm(hotelCount.getZjhm());
        yule.setZz(hotelCount.getZz());
        yule.setXb(hotelCount.getXb());
        yule.setMz(hotelCount.getMz());
        yule.setCsrq(hotelCount.getCsrq());
        yule.setZjlx(hotelCount.getZjlx());
        yule.setType(1);
        //System.out.println(enter);
        yule.setCydz(enter.getUnit_name());
        yule.setCount(hotelCount.getCount());
        String message=hotelCount.getKfjl();
        yule.setMessage(message);
        String[] strs=message.split(",");
        List<Hotelguest> hotelguests = hotelguestMapper.getByZklsh(strs[0]);
        Hotelguest hotelguest=hotelguests.get(0);
        yule.setLast_fh(hotelguest.getFh());
        yule.setLast_lgbm(hotelguest.getLgbm());
        yule.setLast_lgmc(hotelguest.getLgmc());
        yule.setLast_rzsj(hotelguest.getRzsj());
        yule.setJg(hotelguest.getJg());
        return yule;
    }


    public List<Yule>getMess_updte(){
        List<String> zjhms = yuleMapper.getZjhm_update(time);
        List<Yule> yules = getYules(zjhms);
        return yules;
    }

    public List<Yule>getMess_history(){
        List<String> zjhms = yuleMapper.getZjhm_history(month);
        List<Yule> yules = getYules(zjhms);
        return yules;
    }



    public List<Yule> getYules(List<String> zjhms){
        List<Yule>yules=new ArrayList<Yule>();
        for(String zjhm:zjhms){
            List<Yule> yls=yuleMapper.findByZjhm(zjhm);
            int ct=yuleMapper.getCount(zjhm);
            if(ct==1){
                yules.add(yls.get(0));
                continue;
            }
            String[] arr=new String[4];
            int count=0;
            for(Yule yl:yls){
                int type=yl.getType();
                arr[type-1]=yl.getMessage();
                if(yl.getType()==1){
                    count=yl.getCount();
                }
            }
            Yule yule=yls.get(0);
            yule.setCount(count);
            yule.setType(10);
            yule.setMessage(Arrays.toString(arr));
            yules.add(yule);
        }
        return yules;
    }
}
