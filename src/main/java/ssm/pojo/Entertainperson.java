package ssm.pojo;

public class Entertainperson {
    private String idnum;

    private String firstname;

    private String sex;

    private String birthday;

    private String telphone;

    private String registeredaddrstreet;

    private String unit_name;

    private String govern_unit_name;

    private String gover_unit;

    @Override
    public String toString() {
        return "Entertainperson{" +
                "idnum='" + idnum + '\'' +
                ", firstname='" + firstname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", telphone='" + telphone + '\'' +
                ", registeredaddrstreet='" + registeredaddrstreet + '\'' +
                ", unit_name='" + unit_name + '\'' +
                ", govern_unit_name='" + govern_unit_name + '\'' +
                ", gover_unit='" + gover_unit + '\'' +
                '}';
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getRegisteredaddrstreet() {
        return registeredaddrstreet;
    }

    public void setRegisteredaddrstreet(String registeredaddrstreet) {
        this.registeredaddrstreet = registeredaddrstreet;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getGovern_unit_name() {
        return govern_unit_name;
    }

    public void setGovern_unit_name(String govern_unit_name) {
        this.govern_unit_name = govern_unit_name;
    }

    public String getGover_unit() {
        return gover_unit;
    }

    public void setGover_unit(String gover_unit) {
        this.gover_unit = gover_unit;
    }
}