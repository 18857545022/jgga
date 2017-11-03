package ssm.model;


import ssm.pojo.Yxkf;
import ssm.pojo.YxkfPojo;
import ssm.pojo.ZjAndCount;

import java.util.List;

public interface YxkfMapper {
	//存储异性开房记录
	void save(Yxkf yxkf);
	//历史嫖客zjhm获取(条件:month个月内)
	List<String> getZjhm_month(String month);
	//实时嫖客zjhm获取(条件:hour小时一次,统计前month个月的)
	List<String> getZjhm_hour(int hour, int month);
	 //根据zjhm查询开房记录(规定month个月内的 )
	List<YxkfPojo> getYxkfByZjhm_month(int month, String zjhm);

	//返回符合条件的住客信息
	//娱乐：六个月内与2名以上异性开房 month=6，count=2
	List<ZjAndCount> getZjhm(int month, int count);

	List<Yxkf> getMessByZjhm(String zjhm,int month);
	

}
