package ssm.model;

import ssm.pojo.Yule;
import ssm.pojo.ZjAndCount;

import java.util.List;

public interface YuleMapper {
    void save(Yule yule);

    List<String> getZjhm_update(Integer hour);

    List<String> getZjhm_history(Integer month);

    List<Yule> findByZjhm(String zjhm);

    int getCount(String zjhm);
}
