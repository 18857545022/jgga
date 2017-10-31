package ssm.pojo;

public class HotelguestKey {
    private String zjhm;

    private String zklsh;

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm == null ? null : zjhm.trim();
    }

    public String getZklsh() {
        return zklsh;
    }

    public void setZklsh(String zklsh) {
        this.zklsh = zklsh == null ? null : zklsh.trim();
    }
}