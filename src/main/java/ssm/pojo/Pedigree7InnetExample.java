package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedigree7InnetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Pedigree7InnetExample() {
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

        public Criteria andSfzhIsNull() {
            addCriterion("sfzh is null");
            return (Criteria) this;
        }

        public Criteria andSfzhIsNotNull() {
            addCriterion("sfzh is not null");
            return (Criteria) this;
        }

        public Criteria andSfzhEqualTo(String value) {
            addCriterion("sfzh =", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotEqualTo(String value) {
            addCriterion("sfzh <>", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThan(String value) {
            addCriterion("sfzh >", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThanOrEqualTo(String value) {
            addCriterion("sfzh >=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThan(String value) {
            addCriterion("sfzh <", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThanOrEqualTo(String value) {
            addCriterion("sfzh <=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLike(String value) {
            addCriterion("sfzh like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotLike(String value) {
            addCriterion("sfzh not like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhIn(List<String> values) {
            addCriterion("sfzh in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotIn(List<String> values) {
            addCriterion("sfzh not in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhBetween(String value1, String value2) {
            addCriterion("sfzh between", value1, value2, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotBetween(String value1, String value2) {
            addCriterion("sfzh not between", value1, value2, "sfzh");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjIsNull() {
            addCriterion("zdrylbbj is null");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjIsNotNull() {
            addCriterion("zdrylbbj is not null");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjEqualTo(String value) {
            addCriterion("zdrylbbj =", value, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjNotEqualTo(String value) {
            addCriterion("zdrylbbj <>", value, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjGreaterThan(String value) {
            addCriterion("zdrylbbj >", value, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjGreaterThanOrEqualTo(String value) {
            addCriterion("zdrylbbj >=", value, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjLessThan(String value) {
            addCriterion("zdrylbbj <", value, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjLessThanOrEqualTo(String value) {
            addCriterion("zdrylbbj <=", value, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjLike(String value) {
            addCriterion("zdrylbbj like", value, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjNotLike(String value) {
            addCriterion("zdrylbbj not like", value, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjIn(List<String> values) {
            addCriterion("zdrylbbj in", values, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjNotIn(List<String> values) {
            addCriterion("zdrylbbj not in", values, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjBetween(String value1, String value2) {
            addCriterion("zdrylbbj between", value1, value2, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdrylbbjNotBetween(String value1, String value2) {
            addCriterion("zdrylbbj not between", value1, value2, "zdrylbbj");
            return (Criteria) this;
        }

        public Criteria andZdryxlIsNull() {
            addCriterion("zdryxl is null");
            return (Criteria) this;
        }

        public Criteria andZdryxlIsNotNull() {
            addCriterion("zdryxl is not null");
            return (Criteria) this;
        }

        public Criteria andZdryxlEqualTo(String value) {
            addCriterion("zdryxl =", value, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlNotEqualTo(String value) {
            addCriterion("zdryxl <>", value, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlGreaterThan(String value) {
            addCriterion("zdryxl >", value, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlGreaterThanOrEqualTo(String value) {
            addCriterion("zdryxl >=", value, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlLessThan(String value) {
            addCriterion("zdryxl <", value, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlLessThanOrEqualTo(String value) {
            addCriterion("zdryxl <=", value, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlLike(String value) {
            addCriterion("zdryxl like", value, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlNotLike(String value) {
            addCriterion("zdryxl not like", value, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlIn(List<String> values) {
            addCriterion("zdryxl in", values, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlNotIn(List<String> values) {
            addCriterion("zdryxl not in", values, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlBetween(String value1, String value2) {
            addCriterion("zdryxl between", value1, value2, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andZdryxlNotBetween(String value1, String value2) {
            addCriterion("zdryxl not between", value1, value2, "zdryxl");
            return (Criteria) this;
        }

        public Criteria andCsmcIsNull() {
            addCriterion("csmc is null");
            return (Criteria) this;
        }

        public Criteria andCsmcIsNotNull() {
            addCriterion("csmc is not null");
            return (Criteria) this;
        }

        public Criteria andCsmcEqualTo(String value) {
            addCriterion("csmc =", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcNotEqualTo(String value) {
            addCriterion("csmc <>", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcGreaterThan(String value) {
            addCriterion("csmc >", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcGreaterThanOrEqualTo(String value) {
            addCriterion("csmc >=", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcLessThan(String value) {
            addCriterion("csmc <", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcLessThanOrEqualTo(String value) {
            addCriterion("csmc <=", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcLike(String value) {
            addCriterion("csmc like", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcNotLike(String value) {
            addCriterion("csmc not like", value, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcIn(List<String> values) {
            addCriterion("csmc in", values, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcNotIn(List<String> values) {
            addCriterion("csmc not in", values, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcBetween(String value1, String value2) {
            addCriterion("csmc between", value1, value2, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsmcNotBetween(String value1, String value2) {
            addCriterion("csmc not between", value1, value2, "csmc");
            return (Criteria) this;
        }

        public Criteria andCsdzIsNull() {
            addCriterion("csdz is null");
            return (Criteria) this;
        }

        public Criteria andCsdzIsNotNull() {
            addCriterion("csdz is not null");
            return (Criteria) this;
        }

        public Criteria andCsdzEqualTo(String value) {
            addCriterion("csdz =", value, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzNotEqualTo(String value) {
            addCriterion("csdz <>", value, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzGreaterThan(String value) {
            addCriterion("csdz >", value, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzGreaterThanOrEqualTo(String value) {
            addCriterion("csdz >=", value, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzLessThan(String value) {
            addCriterion("csdz <", value, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzLessThanOrEqualTo(String value) {
            addCriterion("csdz <=", value, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzLike(String value) {
            addCriterion("csdz like", value, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzNotLike(String value) {
            addCriterion("csdz not like", value, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzIn(List<String> values) {
            addCriterion("csdz in", values, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzNotIn(List<String> values) {
            addCriterion("csdz not in", values, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzBetween(String value1, String value2) {
            addCriterion("csdz between", value1, value2, "csdz");
            return (Criteria) this;
        }

        public Criteria andCsdzNotBetween(String value1, String value2) {
            addCriterion("csdz not between", value1, value2, "csdz");
            return (Criteria) this;
        }

        public Criteria andKssjIsNull() {
            addCriterion("kssj is null");
            return (Criteria) this;
        }

        public Criteria andKssjIsNotNull() {
            addCriterion("kssj is not null");
            return (Criteria) this;
        }

        public Criteria andKssjEqualTo(String value) {
            addCriterion("kssj =", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotEqualTo(String value) {
            addCriterion("kssj <>", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThan(String value) {
            addCriterion("kssj >", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThanOrEqualTo(String value) {
            addCriterion("kssj >=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThan(String value) {
            addCriterion("kssj <", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThanOrEqualTo(String value) {
            addCriterion("kssj <=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLike(String value) {
            addCriterion("kssj like", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotLike(String value) {
            addCriterion("kssj not like", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjIn(List<String> values) {
            addCriterion("kssj in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotIn(List<String> values) {
            addCriterion("kssj not in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjBetween(String value1, String value2) {
            addCriterion("kssj between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotBetween(String value1, String value2) {
            addCriterion("kssj not between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andJssjIsNull() {
            addCriterion("jssj is null");
            return (Criteria) this;
        }

        public Criteria andJssjIsNotNull() {
            addCriterion("jssj is not null");
            return (Criteria) this;
        }

        public Criteria andJssjEqualTo(String value) {
            addCriterion("jssj =", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotEqualTo(String value) {
            addCriterion("jssj <>", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThan(String value) {
            addCriterion("jssj >", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThanOrEqualTo(String value) {
            addCriterion("jssj >=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThan(String value) {
            addCriterion("jssj <", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThanOrEqualTo(String value) {
            addCriterion("jssj <=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLike(String value) {
            addCriterion("jssj like", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotLike(String value) {
            addCriterion("jssj not like", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjIn(List<String> values) {
            addCriterion("jssj in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotIn(List<String> values) {
            addCriterion("jssj not in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjBetween(String value1, String value2) {
            addCriterion("jssj between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotBetween(String value1, String value2) {
            addCriterion("jssj not between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andCsbmIsNull() {
            addCriterion("csbm is null");
            return (Criteria) this;
        }

        public Criteria andCsbmIsNotNull() {
            addCriterion("csbm is not null");
            return (Criteria) this;
        }

        public Criteria andCsbmEqualTo(String value) {
            addCriterion("csbm =", value, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmNotEqualTo(String value) {
            addCriterion("csbm <>", value, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmGreaterThan(String value) {
            addCriterion("csbm >", value, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmGreaterThanOrEqualTo(String value) {
            addCriterion("csbm >=", value, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmLessThan(String value) {
            addCriterion("csbm <", value, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmLessThanOrEqualTo(String value) {
            addCriterion("csbm <=", value, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmLike(String value) {
            addCriterion("csbm like", value, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmNotLike(String value) {
            addCriterion("csbm not like", value, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmIn(List<String> values) {
            addCriterion("csbm in", values, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmNotIn(List<String> values) {
            addCriterion("csbm not in", values, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmBetween(String value1, String value2) {
            addCriterion("csbm between", value1, value2, "csbm");
            return (Criteria) this;
        }

        public Criteria andCsbmNotBetween(String value1, String value2) {
            addCriterion("csbm not between", value1, value2, "csbm");
            return (Criteria) this;
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