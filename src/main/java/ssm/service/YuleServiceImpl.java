package ssm.service;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ssm.model.EntertainpersonMapper;
import ssm.model.HotelCountMapper;
import ssm.model.HotelMapper;
import ssm.model.YuleMapper;
import ssm.pojo.Entertainperson;
import ssm.pojo.HotelCount;
import ssm.pojo.Hotelguest;
import ssm.pojo.Yule;

import java.util.List;
@Service
public class YuleServiceImpl implements YuleService{

    @Autowired
    private EntertainpersonMapper entertainpersonMapper;
    @Autowired
    private HotelCountMapper hotelCountMapper;

    @Autowired
    private HotelMapper hotelMapper;

    @Autowired
    private YuleMapper yuleMapper;

    @Value("${time}")
    private Integer time;


    public String condition1() {
        //获取娱乐从业人员entertainperson的list
        //遍历list
            //根据entertainperson.idnum去查询hotel_count表中对应数据
            //如果存在数据,进行数据整理并且存入yule表中
        List<Entertainperson> list = entertainpersonMapper.find();
        for(Entertainperson enter:list){
            HotelCount hotelCount = hotelCountMapper.findBycjsj(time, "0607", enter.getIdnum());
            System.out.println(hotelCount);
            if(hotelCount!=null){
                Yule yule = dateToYule(enter, hotelCount);
                yuleMapper.save(yule);
            }
        }
        //System.out.println("存储完毕");
        return "存储完毕";

    }


    public Yule dateToYule(Entertainperson enter,HotelCount hotelCount){
        Yule yule = new Yule();
        yule.setCjsj(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
        yule.setXb(hotelCount.getXb());
        yule.setMz(hotelCount.getMz());
        yule.setZz(hotelCount.getZz());
        yule.setXm(hotelCount.getXm());
        yule.setCsrq(hotelCount.getCsrq());
        yule.setZjlx(hotelCount.getZjhm());
        yule.setType(1);
        yule.setCydz(enter.getUnitName());
        yule.setMessage(hotelCount.getKfjl());
        String message=hotelCount.getKfjl();
        String[] strs=message.split(",");
        Hotelguest hotelguest = hotelMapper.getByZklsh(strs[0]);
        yule.setLastFh(hotelguest.getFh());
        yule.setLastLgbm(hotelguest.getLgbm());
        yule.setLastLgmc(hotelguest.getLgmc());
        yule.setJg(hotelguest.getJg());
        yule.setZjlx(hotelguest.getZjlx());
        return yule;
    }
}
