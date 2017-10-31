package ssm.pojo;

public class Entertainperson {
    private String idnum;

    private String firstname;

    private String sex;

    private String birthday;

    private String telphone;

    private String registeredaddrstreet;

    private String unitName;

    private String governUnitName;

    private String goverUnit;

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum == null ? null : idnum.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getRegisteredaddrstreet() {
        return registeredaddrstreet;
    }

    public void setRegisteredaddrstreet(String registeredaddrstreet) {
        this.registeredaddrstreet = registeredaddrstreet == null ? null : registeredaddrstreet.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getGovernUnitName() {
        return governUnitName;
    }

    public void setGovernUnitName(String governUnitName) {
        this.governUnitName = governUnitName == null ? null : governUnitName.trim();
    }

    public String getGoverUnit() {
        return goverUnit;
    }

    public void setGoverUnit(String goverUnit) {
        this.goverUnit = goverUnit == null ? null : goverUnit.trim();
    }
}