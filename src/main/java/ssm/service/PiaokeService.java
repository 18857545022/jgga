package ssm.service;

import ssm.pojo.PiaokePojo;

import java.util.List;
import java.util.Set;

/**
 * 从嫖客表中获取嫖客信息
 * @author Administrator
 *
 */
public interface PiaokeService {

    public Set<PiaokePojo> getPiaoke_hour();

    public Set<PiaokePojo> getPiaoke_month(int month);

    /**
     * 进行对数据的处理:一人多数据
     * @param list_piaoke
     * @param list_zjhm
     * @param set
     */
    public void changeDate(List<PiaokePojo> list_piaoke, List<String> list_zjhm, Set<PiaokePojo> set);
}
