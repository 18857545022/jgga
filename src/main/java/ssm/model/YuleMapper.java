package ssm.model;

import ssm.pojo.Yule;
import ssm.pojo.ZjAndCount;

import java.util.List;

public interface YuleMapper {
    void save(Yule yule);

    List<ZjAndCount> findZjAndCount_update(Integer hour);

    List<ZjAndCount> find_history(Integer month);

    List<Yule> findByZjhm(String zjhm);
}
