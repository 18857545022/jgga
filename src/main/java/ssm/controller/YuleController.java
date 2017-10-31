package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.service.YuleService;
@Controller
public class YuleController {

    @Autowired
    private YuleService yuleService;

    @ResponseBody
    @RequestMapping("/test1")
    public String yule(){
        String s = yuleService.condition1();
        return s;
    }
}
