package ssm.pojo;

public class ZjAndCount {

    private String zjhm;
    private Integer count;

    @Override
    public String toString() {
        return "ZjAndCount{" +
                "zjhm='" + zjhm + '\'' +
                ", count=" + count +
                '}';
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
