package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaItemExample() {
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

        public Criteria andJq7PercentIsNull() {
            addCriterion("jq_7_percent is null");
            return (Criteria) this;
        }

        public Criteria andJq7PercentIsNotNull() {
            addCriterion("jq_7_percent is not null");
            return (Criteria) this;
        }

        public Criteria andJq7PercentEqualTo(Float value) {
            addCriterion("jq_7_percent =", value, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7PercentNotEqualTo(Float value) {
            addCriterion("jq_7_percent <>", value, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7PercentGreaterThan(Float value) {
            addCriterion("jq_7_percent >", value, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7PercentGreaterThanOrEqualTo(Float value) {
            addCriterion("jq_7_percent >=", value, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7PercentLessThan(Float value) {
            addCriterion("jq_7_percent <", value, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7PercentLessThanOrEqualTo(Float value) {
            addCriterion("jq_7_percent <=", value, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7PercentIn(List<Float> values) {
            addCriterion("jq_7_percent in", values, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7PercentNotIn(List<Float> values) {
            addCriterion("jq_7_percent not in", values, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7PercentBetween(Float value1, Float value2) {
            addCriterion("jq_7_percent between", value1, value2, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7PercentNotBetween(Float value1, Float value2) {
            addCriterion("jq_7_percent not between", value1, value2, "jq7Percent");
            return (Criteria) this;
        }

        public Criteria andJq7AddIsNull() {
            addCriterion("jq_7_add is null");
            return (Criteria) this;
        }

        public Criteria andJq7AddIsNotNull() {
            addCriterion("jq_7_add is not null");
            return (Criteria) this;
        }

        public Criteria andJq7AddEqualTo(Integer value) {
            addCriterion("jq_7_add =", value, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq7AddNotEqualTo(Integer value) {
            addCriterion("jq_7_add <>", value, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq7AddGreaterThan(Integer value) {
            addCriterion("jq_7_add >", value, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq7AddGreaterThanOrEqualTo(Integer value) {
            addCriterion("jq_7_add >=", value, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq7AddLessThan(Integer value) {
            addCriterion("jq_7_add <", value, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq7AddLessThanOrEqualTo(Integer value) {
            addCriterion("jq_7_add <=", value, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq7AddIn(List<Integer> values) {
            addCriterion("jq_7_add in", values, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq7AddNotIn(List<Integer> values) {
            addCriterion("jq_7_add not in", values, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq7AddBetween(Integer value1, Integer value2) {
            addCriterion("jq_7_add between", value1, value2, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq7AddNotBetween(Integer value1, Integer value2) {
            addCriterion("jq_7_add not between", value1, value2, "jq7Add");
            return (Criteria) this;
        }

        public Criteria andJq30PercentIsNull() {
            addCriterion("jq_30_percent is null");
            return (Criteria) this;
        }

        public Criteria andJq30PercentIsNotNull() {
            addCriterion("jq_30_percent is not null");
            return (Criteria) this;
        }

        public Criteria andJq30PercentEqualTo(Float value) {
            addCriterion("jq_30_percent =", value, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andJq30PercentNotEqualTo(Float value) {
            addCriterion("jq_30_percent <>", value, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andJq30PercentGreaterThan(Float value) {
            addCriterion("jq_30_percent >", value, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andJq30PercentGreaterThanOrEqualTo(Float value) {
            addCriterion("jq_30_percent >=", value, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andJq30PercentLessThan(Float value) {
            addCriterion("jq_30_percent <", value, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andJq30PercentLessThanOrEqualTo(Float value) {
            addCriterion("jq_30_percent <=", value, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andJq30PercentIn(List<Float> values) {
            addCriterion("jq_30_percent in", values, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andJq30PercentNotIn(List<Float> values) {
            addCriterion("jq_30_percent not in", values, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andJq30PercentBetween(Float value1, Float value2) {
            addCriterion("jq_30_percent between", value1, value2, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andJq30PercentNotBetween(Float value1, Float value2) {
            addCriterion("jq_30_percent not between", value1, value2, "jq30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7NumIsNull() {
            addCriterion("dfk_7_num is null");
            return (Criteria) this;
        }

        public Criteria andDfk7NumIsNotNull() {
            addCriterion("dfk_7_num is not null");
            return (Criteria) this;
        }

        public Criteria andDfk7NumEqualTo(Integer value) {
            addCriterion("dfk_7_num =", value, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk7NumNotEqualTo(Integer value) {
            addCriterion("dfk_7_num <>", value, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk7NumGreaterThan(Integer value) {
            addCriterion("dfk_7_num >", value, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk7NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dfk_7_num >=", value, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk7NumLessThan(Integer value) {
            addCriterion("dfk_7_num <", value, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk7NumLessThanOrEqualTo(Integer value) {
            addCriterion("dfk_7_num <=", value, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk7NumIn(List<Integer> values) {
            addCriterion("dfk_7_num in", values, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk7NumNotIn(List<Integer> values) {
            addCriterion("dfk_7_num not in", values, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk7NumBetween(Integer value1, Integer value2) {
            addCriterion("dfk_7_num between", value1, value2, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk7NumNotBetween(Integer value1, Integer value2) {
            addCriterion("dfk_7_num not between", value1, value2, "dfk7Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumIsNull() {
            addCriterion("dfk_30_num is null");
            return (Criteria) this;
        }

        public Criteria andDfk30NumIsNotNull() {
            addCriterion("dfk_30_num is not null");
            return (Criteria) this;
        }

        public Criteria andDfk30NumEqualTo(Integer value) {
            addCriterion("dfk_30_num =", value, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumNotEqualTo(Integer value) {
            addCriterion("dfk_30_num <>", value, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumGreaterThan(Integer value) {
            addCriterion("dfk_30_num >", value, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dfk_30_num >=", value, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumLessThan(Integer value) {
            addCriterion("dfk_30_num <", value, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumLessThanOrEqualTo(Integer value) {
            addCriterion("dfk_30_num <=", value, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumIn(List<Integer> values) {
            addCriterion("dfk_30_num in", values, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumNotIn(List<Integer> values) {
            addCriterion("dfk_30_num not in", values, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumBetween(Integer value1, Integer value2) {
            addCriterion("dfk_30_num between", value1, value2, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk30NumNotBetween(Integer value1, Integer value2) {
            addCriterion("dfk_30_num not between", value1, value2, "dfk30Num");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentIsNull() {
            addCriterion("dfk_7_percent is null");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentIsNotNull() {
            addCriterion("dfk_7_percent is not null");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentEqualTo(Float value) {
            addCriterion("dfk_7_percent =", value, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentNotEqualTo(Float value) {
            addCriterion("dfk_7_percent <>", value, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentGreaterThan(Float value) {
            addCriterion("dfk_7_percent >", value, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentGreaterThanOrEqualTo(Float value) {
            addCriterion("dfk_7_percent >=", value, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentLessThan(Float value) {
            addCriterion("dfk_7_percent <", value, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentLessThanOrEqualTo(Float value) {
            addCriterion("dfk_7_percent <=", value, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentIn(List<Float> values) {
            addCriterion("dfk_7_percent in", values, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentNotIn(List<Float> values) {
            addCriterion("dfk_7_percent not in", values, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentBetween(Float value1, Float value2) {
            addCriterion("dfk_7_percent between", value1, value2, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk7PercentNotBetween(Float value1, Float value2) {
            addCriterion("dfk_7_percent not between", value1, value2, "dfk7Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentIsNull() {
            addCriterion("dfk_30_percent is null");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentIsNotNull() {
            addCriterion("dfk_30_percent is not null");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentEqualTo(Float value) {
            addCriterion("dfk_30_percent =", value, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentNotEqualTo(Float value) {
            addCriterion("dfk_30_percent <>", value, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentGreaterThan(Float value) {
            addCriterion("dfk_30_percent >", value, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentGreaterThanOrEqualTo(Float value) {
            addCriterion("dfk_30_percent >=", value, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentLessThan(Float value) {
            addCriterion("dfk_30_percent <", value, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentLessThanOrEqualTo(Float value) {
            addCriterion("dfk_30_percent <=", value, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentIn(List<Float> values) {
            addCriterion("dfk_30_percent in", values, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentNotIn(List<Float> values) {
            addCriterion("dfk_30_percent not in", values, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentBetween(Float value1, Float value2) {
            addCriterion("dfk_30_percent between", value1, value2, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andDfk30PercentNotBetween(Float value1, Float value2) {
            addCriterion("dfk_30_percent not between", value1, value2, "dfk30Percent");
            return (Criteria) this;
        }

        public Criteria andFlowNumIsNull() {
            addCriterion("flow_num is null");
            return (Criteria) this;
        }

        public Criteria andFlowNumIsNotNull() {
            addCriterion("flow_num is not null");
            return (Criteria) this;
        }

        public Criteria andFlowNumEqualTo(Integer value) {
            addCriterion("flow_num =", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumNotEqualTo(Integer value) {
            addCriterion("flow_num <>", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumGreaterThan(Integer value) {
            addCriterion("flow_num >", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_num >=", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumLessThan(Integer value) {
            addCriterion("flow_num <", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumLessThanOrEqualTo(Integer value) {
            addCriterion("flow_num <=", value, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumIn(List<Integer> values) {
            addCriterion("flow_num in", values, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumNotIn(List<Integer> values) {
            addCriterion("flow_num not in", values, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumBetween(Integer value1, Integer value2) {
            addCriterion("flow_num between", value1, value2, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_num not between", value1, value2, "flowNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumIsNull() {
            addCriterion("flow_add_num is null");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumIsNotNull() {
            addCriterion("flow_add_num is not null");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumEqualTo(Integer value) {
            addCriterion("flow_add_num =", value, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumNotEqualTo(Integer value) {
            addCriterion("flow_add_num <>", value, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumGreaterThan(Integer value) {
            addCriterion("flow_add_num >", value, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_add_num >=", value, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumLessThan(Integer value) {
            addCriterion("flow_add_num <", value, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumLessThanOrEqualTo(Integer value) {
            addCriterion("flow_add_num <=", value, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumIn(List<Integer> values) {
            addCriterion("flow_add_num in", values, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumNotIn(List<Integer> values) {
            addCriterion("flow_add_num not in", values, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumBetween(Integer value1, Integer value2) {
            addCriterion("flow_add_num between", value1, value2, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowAddNumNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_add_num not between", value1, value2, "flowAddNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumIsNull() {
            addCriterion("flow_pedigree_num is null");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumIsNotNull() {
            addCriterion("flow_pedigree_num is not null");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumEqualTo(Integer value) {
            addCriterion("flow_pedigree_num =", value, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumNotEqualTo(Integer value) {
            addCriterion("flow_pedigree_num <>", value, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumGreaterThan(Integer value) {
            addCriterion("flow_pedigree_num >", value, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_pedigree_num >=", value, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumLessThan(Integer value) {
            addCriterion("flow_pedigree_num <", value, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumLessThanOrEqualTo(Integer value) {
            addCriterion("flow_pedigree_num <=", value, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumIn(List<Integer> values) {
            addCriterion("flow_pedigree_num in", values, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumNotIn(List<Integer> values) {
            addCriterion("flow_pedigree_num not in", values, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumBetween(Integer value1, Integer value2) {
            addCriterion("flow_pedigree_num between", value1, value2, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andFlowPedigreeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_pedigree_num not between", value1, value2, "flowPedigreeNum");
            return (Criteria) this;
        }

        public Criteria andNetNumIsNull() {
            addCriterion("net_num is null");
            return (Criteria) this;
        }

        public Criteria andNetNumIsNotNull() {
            addCriterion("net_num is not null");
            return (Criteria) this;
        }

        public Criteria andNetNumEqualTo(Integer value) {
            addCriterion("net_num =", value, "netNum");
            return (Criteria) this;
        }

        public Criteria andNetNumNotEqualTo(Integer value) {
            addCriterion("net_num <>", value, "netNum");
            return (Criteria) this;
        }

        public Criteria andNetNumGreaterThan(Integer value) {
            addCriterion("net_num >", value, "netNum");
            return (Criteria) this;
        }

        public Criteria andNetNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("net_num >=", value, "netNum");
            return (Criteria) this;
        }

        public Criteria andNetNumLessThan(Integer value) {
            addCriterion("net_num <", value, "netNum");
            return (Criteria) this;
        }

        public Criteria andNetNumLessThanOrEqualTo(Integer value) {
            addCriterion("net_num <=", value, "netNum");
            return (Criteria) this;
        }

        public Criteria andNetNumIn(List<Integer> values) {
            addCriterion("net_num in", values, "netNum");
            return (Criteria) this;
        }

        public Criteria andNetNumNotIn(List<Integer> values) {
            addCriterion("net_num not in", values, "netNum");
            return (Criteria) this;
        }

        public Criteria andNetNumBetween(Integer value1, Integer value2) {
            addCriterion("net_num between", value1, value2, "netNum");
            return (Criteria) this;
        }

        public Criteria andNetNumNotBetween(Integer value1, Integer value2) {
            addCriterion("net_num not between", value1, value2, "netNum");
            return (Criteria) this;
        }

        public Criteria andHddNumIsNull() {
            addCriterion("hdd_num is null");
            return (Criteria) this;
        }

        public Criteria andHddNumIsNotNull() {
            addCriterion("hdd_num is not null");
            return (Criteria) this;
        }

        public Criteria andHddNumEqualTo(Integer value) {
            addCriterion("hdd_num =", value, "hddNum");
            return (Criteria) this;
        }

        public Criteria andHddNumNotEqualTo(Integer value) {
            addCriterion("hdd_num <>", value, "hddNum");
            return (Criteria) this;
        }

        public Criteria andHddNumGreaterThan(Integer value) {
            addCriterion("hdd_num >", value, "hddNum");
            return (Criteria) this;
        }

        public Criteria andHddNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hdd_num >=", value, "hddNum");
            return (Criteria) this;
        }

        public Criteria andHddNumLessThan(Integer value) {
            addCriterion("hdd_num <", value, "hddNum");
            return (Criteria) this;
        }

        public Criteria andHddNumLessThanOrEqualTo(Integer value) {
            addCriterion("hdd_num <=", value, "hddNum");
            return (Criteria) this;
        }

        public Criteria andHddNumIn(List<Integer> values) {
            addCriterion("hdd_num in", values, "hddNum");
            return (Criteria) this;
        }

        public Criteria andHddNumNotIn(List<Integer> values) {
            addCriterion("hdd_num not in", values, "hddNum");
            return (Criteria) this;
        }

        public Criteria andHddNumBetween(Integer value1, Integer value2) {
            addCriterion("hdd_num between", value1, value2, "hddNum");
            return (Criteria) this;
        }

        public Criteria andHddNumNotBetween(Integer value1, Integer value2) {
            addCriterion("hdd_num not between", value1, value2, "hddNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumIsNull() {
            addCriterion("enter_num is null");
            return (Criteria) this;
        }

        public Criteria andEnterNumIsNotNull() {
            addCriterion("enter_num is not null");
            return (Criteria) this;
        }

        public Criteria andEnterNumEqualTo(Integer value) {
            addCriterion("enter_num =", value, "enterNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumNotEqualTo(Integer value) {
            addCriterion("enter_num <>", value, "enterNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumGreaterThan(Integer value) {
            addCriterion("enter_num >", value, "enterNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("enter_num >=", value, "enterNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumLessThan(Integer value) {
            addCriterion("enter_num <", value, "enterNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumLessThanOrEqualTo(Integer value) {
            addCriterion("enter_num <=", value, "enterNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumIn(List<Integer> values) {
            addCriterion("enter_num in", values, "enterNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumNotIn(List<Integer> values) {
            addCriterion("enter_num not in", values, "enterNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumBetween(Integer value1, Integer value2) {
            addCriterion("enter_num between", value1, value2, "enterNum");
            return (Criteria) this;
        }

        public Criteria andEnterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("enter_num not between", value1, value2, "enterNum");
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