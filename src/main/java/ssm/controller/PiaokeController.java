package ssm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.PiaokePojo;
import ssm.service.PiaokeService;

import java.util.Set;

@Controller
public class PiaokeController {
	
	@Autowired
	private PiaokeService piaokeService;
	
	@RequestMapping(value = "/getNewPiaoke",produces = "application/json;charset=utf-8")
	@ResponseBody
	public Set<PiaokePojo> getPiaoke_new(){
		Set<PiaokePojo> set = piaokeService.getPiaoke_hour();
		return set;
	}
	
	
	@RequestMapping(value = "/getHistoryPiaoke",produces = "application/json;charset=utf-8")
	@ResponseBody
	public Set<PiaokePojo> getPiaoke_history(){
		 Set<PiaokePojo> set = piaokeService.getPiaoke_month(3);
		//System.out.println("成功");
		return set;
	}



}
