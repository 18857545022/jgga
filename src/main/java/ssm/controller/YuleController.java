package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Yule;
import ssm.service.YuleService;

import java.util.List;

@Controller
public class YuleController {

    @Autowired
    private YuleService yuleService;

    @ResponseBody
    @RequestMapping("/condition1")
    public String yule1(){
        String s = yuleService.condition1();
        return s;
    }


    @ResponseBody
    @RequestMapping("/condition2")
    public String yule2(){
        String s = yuleService.condition2();
        return s;
    }

    //定时推送任务

    @ResponseBody
    @RequestMapping("/ylupdate")
    public List<Yule> get_updete(){
        List<Yule> mess_updte = yuleService.getMess_updte();
        return mess_updte;
    }

    @ResponseBody
    @RequestMapping("ylhistory")
    public  List<Yule> get_history(){
        List<Yule>mess_history=yuleService.getMess_history();
        return mess_history;
    }

}
