package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaTotalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("community is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("community is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("community =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("community <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("community >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("community >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("community <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("community <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("community like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("community not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("community in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("community not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("community between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("community not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Integer value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Integer value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Integer value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Integer value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Integer> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Integer> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreIsNull() {
            addCriterion("jq_score is null");
            return (Criteria) this;
        }

        public Criteria andJqScoreIsNotNull() {
            addCriterion("jq_score is not null");
            return (Criteria) this;
        }

        public Criteria andJqScoreEqualTo(Integer value) {
            addCriterion("jq_score =", value, "jqScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreNotEqualTo(Integer value) {
            addCriterion("jq_score <>", value, "jqScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreGreaterThan(Integer value) {
            addCriterion("jq_score >", value, "jqScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("jq_score >=", value, "jqScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreLessThan(Integer value) {
            addCriterion("jq_score <", value, "jqScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreLessThanOrEqualTo(Integer value) {
            addCriterion("jq_score <=", value, "jqScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreIn(List<Integer> values) {
            addCriterion("jq_score in", values, "jqScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreNotIn(List<Integer> values) {
            addCriterion("jq_score not in", values, "jqScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreBetween(Integer value1, Integer value2) {
            addCriterion("jq_score between", value1, value2, "jqScore");
            return (Criteria) this;
        }

        public Criteria andJqScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("jq_score not between", value1, value2, "jqScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreIsNull() {
            addCriterion("dfk_score is null");
            return (Criteria) this;
        }

        public Criteria andDfkScoreIsNotNull() {
            addCriterion("dfk_score is not null");
            return (Criteria) this;
        }

        public Criteria andDfkScoreEqualTo(Integer value) {
            addCriterion("dfk_score =", value, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreNotEqualTo(Integer value) {
            addCriterion("dfk_score <>", value, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreGreaterThan(Integer value) {
            addCriterion("dfk_score >", value, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("dfk_score >=", value, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreLessThan(Integer value) {
            addCriterion("dfk_score <", value, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreLessThanOrEqualTo(Integer value) {
            addCriterion("dfk_score <=", value, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreIn(List<Integer> values) {
            addCriterion("dfk_score in", values, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreNotIn(List<Integer> values) {
            addCriterion("dfk_score not in", values, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreBetween(Integer value1, Integer value2) {
            addCriterion("dfk_score between", value1, value2, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andDfkScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("dfk_score not between", value1, value2, "dfkScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreIsNull() {
            addCriterion("flow_score is null");
            return (Criteria) this;
        }

        public Criteria andFlowScoreIsNotNull() {
            addCriterion("flow_score is not null");
            return (Criteria) this;
        }

        public Criteria andFlowScoreEqualTo(Integer value) {
            addCriterion("flow_score =", value, "flowScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreNotEqualTo(Integer value) {
            addCriterion("flow_score <>", value, "flowScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreGreaterThan(Integer value) {
            addCriterion("flow_score >", value, "flowScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_score >=", value, "flowScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreLessThan(Integer value) {
            addCriterion("flow_score <", value, "flowScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreLessThanOrEqualTo(Integer value) {
            addCriterion("flow_score <=", value, "flowScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreIn(List<Integer> values) {
            addCriterion("flow_score in", values, "flowScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreNotIn(List<Integer> values) {
            addCriterion("flow_score not in", values, "flowScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreBetween(Integer value1, Integer value2) {
            addCriterion("flow_score between", value1, value2, "flowScore");
            return (Criteria) this;
        }

        public Criteria andFlowScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_score not between", value1, value2, "flowScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreIsNull() {
            addCriterion("net_score is null");
            return (Criteria) this;
        }

        public Criteria andNetScoreIsNotNull() {
            addCriterion("net_score is not null");
            return (Criteria) this;
        }

        public Criteria andNetScoreEqualTo(Integer value) {
            addCriterion("net_score =", value, "netScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreNotEqualTo(Integer value) {
            addCriterion("net_score <>", value, "netScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreGreaterThan(Integer value) {
            addCriterion("net_score >", value, "netScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("net_score >=", value, "netScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreLessThan(Integer value) {
            addCriterion("net_score <", value, "netScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreLessThanOrEqualTo(Integer value) {
            addCriterion("net_score <=", value, "netScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreIn(List<Integer> values) {
            addCriterion("net_score in", values, "netScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreNotIn(List<Integer> values) {
            addCriterion("net_score not in", values, "netScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreBetween(Integer value1, Integer value2) {
            addCriterion("net_score between", value1, value2, "netScore");
            return (Criteria) this;
        }

        public Criteria andNetScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("net_score not between", value1, value2, "netScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreIsNull() {
            addCriterion("hdd_score is null");
            return (Criteria) this;
        }

        public Criteria andHddScoreIsNotNull() {
            addCriterion("hdd_score is not null");
            return (Criteria) this;
        }

        public Criteria andHddScoreEqualTo(Integer value) {
            addCriterion("hdd_score =", value, "hddScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreNotEqualTo(Integer value) {
            addCriterion("hdd_score <>", value, "hddScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreGreaterThan(Integer value) {
            addCriterion("hdd_score >", value, "hddScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("hdd_score >=", value, "hddScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreLessThan(Integer value) {
            addCriterion("hdd_score <", value, "hddScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreLessThanOrEqualTo(Integer value) {
            addCriterion("hdd_score <=", value, "hddScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreIn(List<Integer> values) {
            addCriterion("hdd_score in", values, "hddScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreNotIn(List<Integer> values) {
            addCriterion("hdd_score not in", values, "hddScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreBetween(Integer value1, Integer value2) {
            addCriterion("hdd_score between", value1, value2, "hddScore");
            return (Criteria) this;
        }

        public Criteria andHddScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("hdd_score not between", value1, value2, "hddScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreIsNull() {
            addCriterion("enter_score is null");
            return (Criteria) this;
        }

        public Criteria andEnterScoreIsNotNull() {
            addCriterion("enter_score is not null");
            return (Criteria) this;
        }

        public Criteria andEnterScoreEqualTo(Integer value) {
            addCriterion("enter_score =", value, "enterScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreNotEqualTo(Integer value) {
            addCriterion("enter_score <>", value, "enterScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreGreaterThan(Integer value) {
            addCriterion("enter_score >", value, "enterScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("enter_score >=", value, "enterScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreLessThan(Integer value) {
            addCriterion("enter_score <", value, "enterScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreLessThanOrEqualTo(Integer value) {
            addCriterion("enter_score <=", value, "enterScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreIn(List<Integer> values) {
            addCriterion("enter_score in", values, "enterScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreNotIn(List<Integer> values) {
            addCriterion("enter_score not in", values, "enterScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreBetween(Integer value1, Integer value2) {
            addCriterion("enter_score between", value1, value2, "enterScore");
            return (Criteria) this;
        }

        public Criteria andEnterScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("enter_score not between", value1, value2, "enterScore");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("cjsj is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(Date value) {
            addCriterion("cjsj =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterion("cjsj <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterion("cjsj >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("cjsj >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterion("cjsj <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterion("cjsj <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterion("cjsj in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterion("cjsj not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterion("cjsj between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterion("cjsj not between", value1, value2, "cjsj");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}