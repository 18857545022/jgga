package ssm.model;

import ssm.pojo.Piaoke;
import ssm.pojo.PiaokePojo;

import java.util.List;

public interface PiaokeMapper {

	int save(Piaoke piaoke);
	
	List<PiaokePojo> get_hour();
	


	
}
