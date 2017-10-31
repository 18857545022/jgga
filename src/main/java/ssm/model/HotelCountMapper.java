package ssm.model;

import ssm.pojo.HotelCount;

import java.util.List;

public interface HotelCountMapper {
    void add(HotelCount hotelCount);

    /**
     * type='0607' 娱乐从业人员所需开房记录 1.6个月 2.7次以上
     *
     */
    HotelCount findBycjsj(Integer hour,String type,String zjhm);
}
