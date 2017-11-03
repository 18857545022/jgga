package ssm.model;

import ssm.pojo.HotelCount;
import ssm.pojo.Hotelguest;

import java.util.List;

public interface HotelCountMapper {
    void save(HotelCount hotelCount);

    /**
     * type='0607' 娱乐从业人员所需开房记录 1.6个月 2.7次以上
     *
     */
    List<HotelCount> findByRzsj_hostory(Integer month, String type, String zjhm);

    List<HotelCount> findByRzsj_update(Integer hour, String type, String zjhm);

    //获取所有满足条件的数据
    public List<HotelCount> getHotelCount(String type);
    //按时间获取满足条件的开房次数条件
    public List<HotelCount> getHotelCount_update(String type,Integer hour);

}
