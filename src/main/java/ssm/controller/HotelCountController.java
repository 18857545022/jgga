package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.service.HotelCountService;

import java.util.List;
@Controller
public class HotelCountController {

    @Autowired
    private HotelCountService hotelCountService;

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        String s = hotelCountService.saveHotelCount(6, 7);
        return s;
    }
}
