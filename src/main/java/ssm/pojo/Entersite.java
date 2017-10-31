package ssm.pojo;

public class Entersite {
    private Integer id;

    private String street;

    private String community;

    private String name;

    private String addr;

    private String legal;

    private String phone;

    private String proprietor;

    private String phonePro;

    private String employnum;

    private String type;

    private String mark;

    private String ispornography;

    private String isclose;

    private String isdetention;

    private Integer isdelete;

    private String jd;

    private String wd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal == null ? null : legal.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getProprietor() {
        return proprietor;
    }

    public void setProprietor(String proprietor) {
        this.proprietor = proprietor == null ? null : proprietor.trim();
    }

    public String getPhonePro() {
        return phonePro;
    }

    public void setPhonePro(String phonePro) {
        this.phonePro = phonePro == null ? null : phonePro.trim();
    }

    public String getEmploynum() {
        return employnum;
    }

    public void setEmploynum(String employnum) {
        this.employnum = employnum == null ? null : employnum.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getIspornography() {
        return ispornography;
    }

    public void setIspornography(String ispornography) {
        this.ispornography = ispornography == null ? null : ispornography.trim();
    }

    public String getIsclose() {
        return isclose;
    }

    public void setIsclose(String isclose) {
        this.isclose = isclose == null ? null : isclose.trim();
    }

    public String getIsdetention() {
        return isdetention;
    }

    public void setIsdetention(String isdetention) {
        this.isdetention = isdetention == null ? null : isdetention.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
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
}