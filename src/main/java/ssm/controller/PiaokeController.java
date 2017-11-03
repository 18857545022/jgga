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

	@RequestMapping("/savepiaoke1")
	@ResponseBody
	public void savePiaoke_history(){
		piaokeService.condition1("0106");
		System.out.println("piaoke条件1存储完毕");
	}





}
