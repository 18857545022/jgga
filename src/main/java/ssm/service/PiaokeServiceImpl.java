package ssm.service;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ssm.model.HotelCountMapper;
import ssm.model.PiaokeMapper;
import ssm.pojo.HotelCount;
import ssm.pojo.Hotelguest;
import ssm.pojo.Piaoke;
import ssm.pojo.PiaokePojo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PiaokeServiceImpl implements  PiaokeService {
    @Autowired
    private PiaokeMapper piaokeMapper;

    @Autowired
    private HotelCountService hotelCountService;

    @Autowired
    private HotelCountMapper hotelCountMapper;


    //获取满足条件1:一个月内开房count次以上//未
    public void condition1(String type){
        //获取所有的历史住客次数
        List<HotelCount> hotelCounts = hotelCountMapper.getHotelCount(type);
        //遍历循环,存储piaoke
        for(HotelCount hotelCount:hotelCounts){
            Piaoke piaoke = new Piaoke();
            piaoke.setCjsj(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
            piaoke.setXm(hotelCount.getXm());
            piaoke.setZjhm(hotelCount.getZjhm());
            piaoke.setZz(hotelCount.getZz());
            piaoke.setXb(hotelCount.getXb());
            piaoke.setMz(hotelCount.getMz());
            piaoke.setCsrq(hotelCount.getCsrq());
            piaoke.setZjlx(hotelCount.getZjlx());
            piaoke.setJg(hotelCount.getJg());
            piaoke.setType(1);
            piaoke.setLast_rzsj(hotelCount.getLast_rzsj());
            piaoke.setLast_lgbm(hotelCount.getLast_lgbm());
            piaoke.setLast_lgmc(hotelCount.getLast_lbmc());
            piaoke.setLast_fh(hotelCount.getLast_fh());
            piaoke.setCount(hotelCount.getCount());
            piaoke.setMessage(hotelCount.getKfjl());
            piaokeMapper.save(piaoke);
        }



    }



}
