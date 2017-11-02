package ssm.model;

import ssm.pojo.Hotelguest;

import java.util.List;

public interface HotelguestMapper {

    List<String> getHotelCount(Integer month,Integer count);

    List<Hotelguest> getByZjhm(Integer month,String zjhm);

    Hotelguest getByZklsh(String zklsh);

    List<Hotelguest> get_history(Integer day);

    List<Hotelguest> getByXb_history(String xb,Integer day);

    List<Hotelguest> getByXb_update(String xb,Integer hour);
}
