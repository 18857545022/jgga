package ssm.pojo;

import java.util.Date;

public class AreaTotal extends AreaTotalKey {
    private Integer id;

    private Integer totalScore;

    private Integer jqScore;

    private Integer dfkScore;

    private Integer flowScore;

    private Integer netScore;

    private Integer hddScore;

    private Integer enterScore;

    private Date cjsj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getJqScore() {
        return jqScore;
    }

    public void setJqScore(Integer jqScore) {
        this.jqScore = jqScore;
    }

    public Integer getDfkScore() {
        return dfkScore;
    }

    public void setDfkScore(Integer dfkScore) {
        this.dfkScore = dfkScore;
    }

    public Integer getFlowScore() {
        return flowScore;
    }

    public void setFlowScore(Integer flowScore) {
        this.flowScore = flowScore;
    }

    public Integer getNetScore() {
        return netScore;
    }

    public void setNetScore(Integer netScore) {
        this.netScore = netScore;
    }

    public Integer getHddScore() {
        return hddScore;
    }

    public void setHddScore(Integer hddScore) {
        this.hddScore = hddScore;
    }

    public Integer getEnterScore() {
        return enterScore;
    }

    public void setEnterScore(Integer enterScore) {
        this.enterScore = enterScore;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
}