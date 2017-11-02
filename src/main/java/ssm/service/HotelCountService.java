package ssm.service;

public interface HotelCountService {


    /**
     * 存储满足次数的住客开房信息
     * param：month-----几个月内
     *        count----几次以上
     * 备注：type=‘0607’ 表示6月内7次以上
     */

    public String saveHotelCount(Integer month, Integer count);

}
