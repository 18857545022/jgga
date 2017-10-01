package ssm.controller;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.model.HotelguestMapper;
import ssm.model.YxkfMapper;
import ssm.pojo.Hotelguest;
import ssm.pojo.Piaoke;
import ssm.pojo.Yxkf;
import ssm.service.HotelCountService;
import ssm.service.PiaokeService;
import ssm.service.YuleService;
import ssm.service.YxkfService;
public class TestController {
    @Autowired
    private HotelCountService hotelCountService;
    @Autowired
    private PiaokeService paiokeService;
    @Autowired
    private YuleService yuleService;
    @Autowired
    private YxkfService yxkfService;


    @Value("${time}")
    private Integer time;
    @Value("${yuleMonth}")
    private Integer yuleMonth;
    @Value("${yuleYxRs}")
    private Integer yuleYxRs;


    private Integer piaokeMonth=1;

    @Value("${piaokeCount}")
    private Integer piaokeCount;
    @Value("${piaokeYxRs}")
    private Integer piaokeYxRs;

   public void test_yule(){
       //存储娱乐开房次数信息
       hotelCountService.saveHotelCount(yuleMonth,7,"0607");
       //匹配异性开房信息(历史)
       yxkfService.saveYxkf_history();
        //匹配异性开房信息(实时)
       yxkfService.saveYxkf_update();
       //满足娱乐条件1数据存储
       yuleService.condition1();
       //满足娱乐条件2数据存储
       yuleService.condition2();
       //获取娱乐数据(历史)
       yuleService.getMess_history();
        //获取娱乐数据(1小时推送)
       yuleService.getMess_updte();


   }


   public void test_piaoke(){
       //初始任务
       //存储次数信息
        hotelCountService.saveHotelCount(piaokeMonth,piaokeCount,"010"+piaokeCount);
        //条件1数据存储
        paiokeService.condition1("0106");





        //更新任务

   }

}
