package ssm.pojo;

import java.util.Date;

public class PoliceCommunity {
    private String jjdbh;

    private String street;

    private String community;

    private String date;

    private String jd;

    private String wd;

    private String gxdwdm;

    private String afdd;

    private String bjsj;

    private String bjlbdm;

    private String bjlxdm;

    private Date cjsj;

    private String bjnr;

    public String getJjdbh() {
        return jjdbh;
    }

    public void setJjdbh(String jjdbh) {
        this.jjdbh = jjdbh == null ? null : jjdbh.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd == null ? null : jd.trim();
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd == null ? null : wd.trim();
    }

    public String getGxdwdm() {
        return gxdwdm;
    }

    public void setGxdwdm(String gxdwdm) {
        this.gxdwdm = gxdwdm == null ? null : gxdwdm.trim();
    }

    public String getAfdd() {
        return afdd;
    }

    public void setAfdd(String afdd) {
        this.afdd = afdd == null ? null : afdd.trim();
    }

    public String getBjsj() {
        return bjsj;
    }

    public void setBjsj(String bjsj) {
        this.bjsj = bjsj == null ? null : bjsj.trim();
    }

    public String getBjlbdm() {
        return bjlbdm;
    }

    public void setBjlbdm(String bjlbdm) {
        this.bjlbdm = bjlbdm == null ? null : bjlbdm.trim();
    }

    public String getBjlxdm() {
        return bjlxdm;
    }

    public void setBjlxdm(String bjlxdm) {
        this.bjlxdm = bjlxdm == null ? null : bjlxdm.trim();
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public String getBjnr() {
        return bjnr;
    }

    public void setBjnr(String bjnr) {
        this.bjnr = bjnr == null ? null : bjnr.trim();
    }
}