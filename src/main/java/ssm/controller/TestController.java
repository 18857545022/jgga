package ssm.controller;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.model.YxkfMapper;
import ssm.pojo.Yxkf;
import ssm.service.YxkfService;
@Controller
public class TestController {



    @Autowired
    private YxkfService yxkfService;
    @RequestMapping("/test2")
    @ResponseBody
    public String test(){
        System.out.println("开始");
        long timeMillis = System.currentTimeMillis();
        yxkfService.saveYxkf_history();
        System.out.println(new DateTime().toString("yyyy-MM-dd HH:mm:ss")+"完成yxkf数据初始化;耗时:"+(System.currentTimeMillis()-timeMillis));
        return"OK";
    }
}
