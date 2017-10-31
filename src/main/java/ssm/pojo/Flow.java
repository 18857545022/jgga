package ssm.pojo;

public class Flow {
    private String dept;

    private String community;

    private Integer yearNew;

    private Integer register;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public Integer getYearNew() {
        return yearNew;
    }

    public void setYearNew(Integer yearNew) {
        this.yearNew = yearNew;
    }

    public Integer getRegister() {
        return register;
    }

    public void setRegister(Integer register) {
        this.register = register;
    }
}