package ssm.pojo;

public class Yx {
    private  String xm;
    private String zjhm;
    private  int type;
    private  int count;
    private  String kfjl;

    @Override
    public String toString() {
        return "{" +
                "xm='" + xm + '\'' +
                ", zjhm='" + zjhm + '\'' +
                ", type=" + type +
                ", count=" + count +
                ", kfjl='" + kfjl + '\'' +
                '}';
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getKfjl() {
        return kfjl;
    }

    public void setKfjl(String kfjl) {
        this.kfjl = kfjl;
    }
}
