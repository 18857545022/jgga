package ssm.service;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.model.HotelCountMapper;
import ssm.model.HotelguestMapper;
import ssm.pojo.HotelCount;
import ssm.pojo.Hotelguest;

import java.util.List;
@Service
public class HotelCountServiceImpl implements  HotelCountService {
    @Autowired
    private HotelguestMapper hotelguestMapper;

    @Autowired
    private HotelCountMapper hotelCountMapper;

    /**
     * 存储满足次数的住客开房信息
     * param：month-----几个月内
     *        count----几次以上
     * 备注：type=‘0607’ 表示6月内7次以上
     */
    public String saveHotelCount(Integer month, Integer count){
        List<String> zjhms = hotelguestMapper.getHotelCount(6, 7);
        HotelCount hotelcout=new HotelCount();
        for(String zjhm:zjhms){
            List<Hotelguest> hotels = hotelguestMapper.getByZjhm(6, zjhm);
            HotelCount hotelCount = hotelToHotelcount(hotels);
            //System.out.println(hotelCount.toString());
            hotelCountMapper.add(hotelCount);
           /* if(i==0){
                System.out.println("该条数据存储失败:"+hotelCount.toString());
            }*/

        }
        //System.out.println(new DateTime().toString("yyyy-MM-dd hh-mm-ss")+":存储命令执行完毕");
        return new DateTime().toString("yyyy-MM-dd HH:mm:ss")+":存储命令执行完毕";
    }

    //封装Hotelguest>>>>HotelCount的转变
    public HotelCount hotelToHotelcount(List<Hotelguest> hotels){
        HotelCount hotelCount = new HotelCount();
        String kfjl="";
        for(int i=0;i<hotels.size();i++){
            if(i==0){
                Hotelguest hotel=hotels.get(0);
                hotelCount.setCjsj(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
                hotelCount.setXm(hotel.getXm());
                hotelCount.setZjhm(hotel.getZjhm());
                hotelCount.setCount(hotels.size());
                hotelCount.setZz(hotel.getZz());
                hotelCount.setXb(hotel.getXb());
                hotelCount.setMz(hotel.getMz());
                hotelCount.setCsrq(hotel.getCsrq());
                hotelCount.setZjlx(hotel.getZjlx());
                hotelCount.setType("0607");
                kfjl=hotels.get(i).getZklsh();
            }else{
                kfjl+=(","+hotels.get(i).getZklsh());
            }
        }
        hotelCount.setKfjl(kfjl);
        return hotelCount;
    }


}
