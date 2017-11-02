package ssm.service;

import ssm.pojo.Hotelguest;

import java.util.List;

public interface YxkfService {

    //初始化yxkf匹配数据
    public void saveYxkf_history();

    //定时执行更新yxkf匹配数据
    public void saveYxkf_update();

    //匹配方法封装
    public void mateAndSaveyxkf(List<Hotelguest> guests);
}
