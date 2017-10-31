package ssm.pojo;

import java.util.Date;

public class Pedigree7Innet extends Pedigree7InnetKey {
    private String name;

    private String zdrylbbj;

    private String zdryxl;

    private String csmc;

    private String csdz;

    private String kssj;

    private String jssj;

    private String csbm;

    private String street;

    private String community;

    private Date cjsj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getZdrylbbj() {
        return zdrylbbj;
    }

    public void setZdrylbbj(String zdrylbbj) {
        this.zdrylbbj = zdrylbbj == null ? null : zdrylbbj.trim();
    }

    public String getZdryxl() {
        return zdryxl;
    }

    public void setZdryxl(String zdryxl) {
        this.zdryxl = zdryxl == null ? null : zdryxl.trim();
    }

    public String getCsmc() {
        return csmc;
    }

    public void setCsmc(String csmc) {
        this.csmc = csmc == null ? null : csmc.trim();
    }

    public String getCsdz() {
        return csdz;
    }

    public void setCsdz(String csdz) {
        this.csdz = csdz == null ? null : csdz.trim();
    }

    public String getKssj() {
        return kssj;
    }

    public void setKssj(String kssj) {
        this.kssj = kssj == null ? null : kssj.trim();
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj == null ? null : jssj.trim();
    }

    public String getCsbm() {
        return csbm;
    }

    public void setCsbm(String csbm) {
        this.csbm = csbm == null ? null : csbm.trim();
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

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
}