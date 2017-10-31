package ssm.model;

import ssm.pojo.Hotelguest;

import java.util.List;

public interface HotelMapper {

    List<String> getHotelCount(Integer month,Integer count);

    List<Hotelguest> getByZjhm(Integer month,String zjhm);

    Hotelguest getByZklsh(String zklsh);
}
