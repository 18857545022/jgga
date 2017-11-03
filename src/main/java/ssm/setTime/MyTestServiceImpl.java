package ssm.setTime;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import ssm.service.HotelCountService;
import ssm.service.YuleService;
import ssm.service.YxkfService;

import  java.lang.System;
@Component
public class MyTestServiceImpl implements MyTestService{
	
	@Autowired
	private YuleService yuleService;

	@Autowired
	private YxkfService yxkfService;

	@Autowired
	private HotelCountService hotelCountService;

	//初始化数据任务
	@Scheduled(cron="0 0 0 20 10 *")
	public void work_init() {
		Long time= 1508428800000L;
		if(time-System.currentTimeMillis()>-1000&&time-System.currentTimeMillis()<1000){
			System.out.println(new DateTime().toString("yy-MM-dd HH:mm:ss")+ ">>>>>>初始化启动任务");
			//娱乐模块初始化
			//hotelCountService.saveHotelCount(6,7);
			yxkfService.saveYxkf_history();
			yuleService.condition2();
			yuleService.condition1();

			System.out.println(new DateTime().toString("yy-MM-dd HH:mm:ss")+ ">>>>>>初始化结束任务");
		}
	}

	//定时定点任务
	//@Scheduled(cron="0 0 0-23 * * ?")
	public void work_oneHour(){
		System.out.println(new DateTime().toString("yy-MM-dd HH:mm:ss")+ ">>>>>>启动任务");
		//---------------------------------------------------------------------------------
		hotelCountService.saveHotelCount(6,7,"0607");
		yxkfService.saveYxkf_update();
		yuleService.condition1();
		yuleService.condition2();
		//----------------------------------------------------------------------------------
		System.out.println(new DateTime().toString("yy-MM-dd HH:mm:ss")+ ">>>>>>结束任务");
	}

}
