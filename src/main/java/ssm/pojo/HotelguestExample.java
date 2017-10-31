package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelguestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelguestExample() {
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

        public Criteria andZjhmIsNull() {
            addCriterion("zjhm is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(String value) {
            addCriterion("zjhm =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(String value) {
            addCriterion("zjhm <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(String value) {
            addCriterion("zjhm >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("zjhm >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(String value) {
            addCriterion("zjhm <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(String value) {
            addCriterion("zjhm <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLike(String value) {
            addCriterion("zjhm like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotLike(String value) {
            addCriterion("zjhm not like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<String> values) {
            addCriterion("zjhm in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<String> values) {
            addCriterion("zjhm not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(String value1, String value2) {
            addCriterion("zjhm between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(String value1, String value2) {
            addCriterion("zjhm not between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZklshIsNull() {
            addCriterion("zklsh is null");
            return (Criteria) this;
        }

        public Criteria andZklshIsNotNull() {
            addCriterion("zklsh is not null");
            return (Criteria) this;
        }

        public Criteria andZklshEqualTo(String value) {
            addCriterion("zklsh =", value, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshNotEqualTo(String value) {
            addCriterion("zklsh <>", value, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshGreaterThan(String value) {
            addCriterion("zklsh >", value, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshGreaterThanOrEqualTo(String value) {
            addCriterion("zklsh >=", value, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshLessThan(String value) {
            addCriterion("zklsh <", value, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshLessThanOrEqualTo(String value) {
            addCriterion("zklsh <=", value, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshLike(String value) {
            addCriterion("zklsh like", value, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshNotLike(String value) {
            addCriterion("zklsh not like", value, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshIn(List<String> values) {
            addCriterion("zklsh in", values, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshNotIn(List<String> values) {
            addCriterion("zklsh not in", values, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshBetween(String value1, String value2) {
            addCriterion("zklsh between", value1, value2, "zklsh");
            return (Criteria) this;
        }

        public Criteria andZklshNotBetween(String value1, String value2) {
            addCriterion("zklsh not between", value1, value2, "zklsh");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andZzIsNull() {
            addCriterion("zz is null");
            return (Criteria) this;
        }

        public Criteria andZzIsNotNull() {
            addCriterion("zz is not null");
            return (Criteria) this;
        }

        public Criteria andZzEqualTo(String value) {
            addCriterion("zz =", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotEqualTo(String value) {
            addCriterion("zz <>", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzGreaterThan(String value) {
            addCriterion("zz >", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzGreaterThanOrEqualTo(String value) {
            addCriterion("zz >=", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzLessThan(String value) {
            addCriterion("zz <", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzLessThanOrEqualTo(String value) {
            addCriterion("zz <=", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzLike(String value) {
            addCriterion("zz like", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotLike(String value) {
            addCriterion("zz not like", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzIn(List<String> values) {
            addCriterion("zz in", values, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotIn(List<String> values) {
            addCriterion("zz not in", values, "zz");
            return (Criteria) this;
        }

        public Criteria andZzBetween(String value1, String value2) {
            addCriterion("zz between", value1, value2, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotBetween(String value1, String value2) {
            addCriterion("zz not between", value1, value2, "zz");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andMzIsNull() {
            addCriterion("mz is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("mz is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(String value) {
            addCriterion("mz =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(String value) {
            addCriterion("mz <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(String value) {
            addCriterion("mz >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(String value) {
            addCriterion("mz >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(String value) {
            addCriterion("mz <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(String value) {
            addCriterion("mz <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLike(String value) {
            addCriterion("mz like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotLike(String value) {
            addCriterion("mz not like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<String> values) {
            addCriterion("mz in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<String> values) {
            addCriterion("mz not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(String value1, String value2) {
            addCriterion("mz between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(String value1, String value2) {
            addCriterion("mz not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("csrq is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("csrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(String value) {
            addCriterion("csrq =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(String value) {
            addCriterion("csrq <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(String value) {
            addCriterion("csrq >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(String value) {
            addCriterion("csrq >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(String value) {
            addCriterion("csrq <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(String value) {
            addCriterion("csrq <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLike(String value) {
            addCriterion("csrq like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotLike(String value) {
            addCriterion("csrq not like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<String> values) {
            addCriterion("csrq in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<String> values) {
            addCriterion("csrq not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(String value1, String value2) {
            addCriterion("csrq between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(String value1, String value2) {
            addCriterion("csrq not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNull() {
            addCriterion("zjlx is null");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNotNull() {
            addCriterion("zjlx is not null");
            return (Criteria) this;
        }

        public Criteria andZjlxEqualTo(String value) {
            addCriterion("zjlx =", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotEqualTo(String value) {
            addCriterion("zjlx <>", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThan(String value) {
            addCriterion("zjlx >", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThanOrEqualTo(String value) {
            addCriterion("zjlx >=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThan(String value) {
            addCriterion("zjlx <", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThanOrEqualTo(String value) {
            addCriterion("zjlx <=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLike(String value) {
            addCriterion("zjlx like", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotLike(String value) {
            addCriterion("zjlx not like", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxIn(List<String> values) {
            addCriterion("zjlx in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotIn(List<String> values) {
            addCriterion("zjlx not in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxBetween(String value1, String value2) {
            addCriterion("zjlx between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotBetween(String value1, String value2) {
            addCriterion("zjlx not between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andLgmcIsNull() {
            addCriterion("lgmc is null");
            return (Criteria) this;
        }

        public Criteria andLgmcIsNotNull() {
            addCriterion("lgmc is not null");
            return (Criteria) this;
        }

        public Criteria andLgmcEqualTo(String value) {
            addCriterion("lgmc =", value, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcNotEqualTo(String value) {
            addCriterion("lgmc <>", value, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcGreaterThan(String value) {
            addCriterion("lgmc >", value, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcGreaterThanOrEqualTo(String value) {
            addCriterion("lgmc >=", value, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcLessThan(String value) {
            addCriterion("lgmc <", value, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcLessThanOrEqualTo(String value) {
            addCriterion("lgmc <=", value, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcLike(String value) {
            addCriterion("lgmc like", value, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcNotLike(String value) {
            addCriterion("lgmc not like", value, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcIn(List<String> values) {
            addCriterion("lgmc in", values, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcNotIn(List<String> values) {
            addCriterion("lgmc not in", values, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcBetween(String value1, String value2) {
            addCriterion("lgmc between", value1, value2, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgmcNotBetween(String value1, String value2) {
            addCriterion("lgmc not between", value1, value2, "lgmc");
            return (Criteria) this;
        }

        public Criteria andLgbmIsNull() {
            addCriterion("lgbm is null");
            return (Criteria) this;
        }

        public Criteria andLgbmIsNotNull() {
            addCriterion("lgbm is not null");
            return (Criteria) this;
        }

        public Criteria andLgbmEqualTo(String value) {
            addCriterion("lgbm =", value, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmNotEqualTo(String value) {
            addCriterion("lgbm <>", value, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmGreaterThan(String value) {
            addCriterion("lgbm >", value, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmGreaterThanOrEqualTo(String value) {
            addCriterion("lgbm >=", value, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmLessThan(String value) {
            addCriterion("lgbm <", value, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmLessThanOrEqualTo(String value) {
            addCriterion("lgbm <=", value, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmLike(String value) {
            addCriterion("lgbm like", value, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmNotLike(String value) {
            addCriterion("lgbm not like", value, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmIn(List<String> values) {
            addCriterion("lgbm in", values, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmNotIn(List<String> values) {
            addCriterion("lgbm not in", values, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmBetween(String value1, String value2) {
            addCriterion("lgbm between", value1, value2, "lgbm");
            return (Criteria) this;
        }

        public Criteria andLgbmNotBetween(String value1, String value2) {
            addCriterion("lgbm not between", value1, value2, "lgbm");
            return (Criteria) this;
        }

        public Criteria andFhIsNull() {
            addCriterion("fh is null");
            return (Criteria) this;
        }

        public Criteria andFhIsNotNull() {
            addCriterion("fh is not null");
            return (Criteria) this;
        }

        public Criteria andFhEqualTo(String value) {
            addCriterion("fh =", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotEqualTo(String value) {
            addCriterion("fh <>", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThan(String value) {
            addCriterion("fh >", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThanOrEqualTo(String value) {
            addCriterion("fh >=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThan(String value) {
            addCriterion("fh <", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThanOrEqualTo(String value) {
            addCriterion("fh <=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLike(String value) {
            addCriterion("fh like", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotLike(String value) {
            addCriterion("fh not like", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhIn(List<String> values) {
            addCriterion("fh in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotIn(List<String> values) {
            addCriterion("fh not in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhBetween(String value1, String value2) {
            addCriterion("fh between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotBetween(String value1, String value2) {
            addCriterion("fh not between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andLdsjIsNull() {
            addCriterion("ldsj is null");
            return (Criteria) this;
        }

        public Criteria andLdsjIsNotNull() {
            addCriterion("ldsj is not null");
            return (Criteria) this;
        }

        public Criteria andLdsjEqualTo(String value) {
            addCriterion("ldsj =", value, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjNotEqualTo(String value) {
            addCriterion("ldsj <>", value, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjGreaterThan(String value) {
            addCriterion("ldsj >", value, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjGreaterThanOrEqualTo(String value) {
            addCriterion("ldsj >=", value, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjLessThan(String value) {
            addCriterion("ldsj <", value, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjLessThanOrEqualTo(String value) {
            addCriterion("ldsj <=", value, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjLike(String value) {
            addCriterion("ldsj like", value, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjNotLike(String value) {
            addCriterion("ldsj not like", value, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjIn(List<String> values) {
            addCriterion("ldsj in", values, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjNotIn(List<String> values) {
            addCriterion("ldsj not in", values, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjBetween(String value1, String value2) {
            addCriterion("ldsj between", value1, value2, "ldsj");
            return (Criteria) this;
        }

        public Criteria andLdsjNotBetween(String value1, String value2) {
            addCriterion("ldsj not between", value1, value2, "ldsj");
            return (Criteria) this;
        }

        public Criteria andRzsjIsNull() {
            addCriterion("rzsj is null");
            return (Criteria) this;
        }

        public Criteria andRzsjIsNotNull() {
            addCriterion("rzsj is not null");
            return (Criteria) this;
        }

        public Criteria andRzsjEqualTo(String value) {
            addCriterion("rzsj =", value, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjNotEqualTo(String value) {
            addCriterion("rzsj <>", value, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjGreaterThan(String value) {
            addCriterion("rzsj >", value, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjGreaterThanOrEqualTo(String value) {
            addCriterion("rzsj >=", value, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjLessThan(String value) {
            addCriterion("rzsj <", value, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjLessThanOrEqualTo(String value) {
            addCriterion("rzsj <=", value, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjLike(String value) {
            addCriterion("rzsj like", value, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjNotLike(String value) {
            addCriterion("rzsj not like", value, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjIn(List<String> values) {
            addCriterion("rzsj in", values, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjNotIn(List<String> values) {
            addCriterion("rzsj not in", values, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjBetween(String value1, String value2) {
            addCriterion("rzsj between", value1, value2, "rzsj");
            return (Criteria) this;
        }

        public Criteria andRzsjNotBetween(String value1, String value2) {
            addCriterion("rzsj not between", value1, value2, "rzsj");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("jg is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("jg is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(String value) {
            addCriterion("jg =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(String value) {
            addCriterion("jg <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(String value) {
            addCriterion("jg >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(String value) {
            addCriterion("jg >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(String value) {
            addCriterion("jg <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(String value) {
            addCriterion("jg <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLike(String value) {
            addCriterion("jg like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotLike(String value) {
            addCriterion("jg not like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<String> values) {
            addCriterion("jg in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<String> values) {
            addCriterion("jg not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(String value1, String value2) {
            addCriterion("jg between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(String value1, String value2) {
            addCriterion("jg not between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andLgdzIsNull() {
            addCriterion("lgdz is null");
            return (Criteria) this;
        }

        public Criteria andLgdzIsNotNull() {
            addCriterion("lgdz is not null");
            return (Criteria) this;
        }

        public Criteria andLgdzEqualTo(String value) {
            addCriterion("lgdz =", value, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzNotEqualTo(String value) {
            addCriterion("lgdz <>", value, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzGreaterThan(String value) {
            addCriterion("lgdz >", value, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzGreaterThanOrEqualTo(String value) {
            addCriterion("lgdz >=", value, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzLessThan(String value) {
            addCriterion("lgdz <", value, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzLessThanOrEqualTo(String value) {
            addCriterion("lgdz <=", value, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzLike(String value) {
            addCriterion("lgdz like", value, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzNotLike(String value) {
            addCriterion("lgdz not like", value, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzIn(List<String> values) {
            addCriterion("lgdz in", values, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzNotIn(List<String> values) {
            addCriterion("lgdz not in", values, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzBetween(String value1, String value2) {
            addCriterion("lgdz between", value1, value2, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzNotBetween(String value1, String value2) {
            addCriterion("lgdz not between", value1, value2, "lgdz");
            return (Criteria) this;
        }

        public Criteria andLgdzqhIsNull() {
            addCriterion("lgdzqh is null");
            return (Criteria) this;
        }

        public Criteria andLgdzqhIsNotNull() {
            addCriterion("lgdzqh is not null");
            return (Criteria) this;
        }

        public Criteria andLgdzqhEqualTo(String value) {
            addCriterion("lgdzqh =", value, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhNotEqualTo(String value) {
            addCriterion("lgdzqh <>", value, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhGreaterThan(String value) {
            addCriterion("lgdzqh >", value, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhGreaterThanOrEqualTo(String value) {
            addCriterion("lgdzqh >=", value, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhLessThan(String value) {
            addCriterion("lgdzqh <", value, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhLessThanOrEqualTo(String value) {
            addCriterion("lgdzqh <=", value, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhLike(String value) {
            addCriterion("lgdzqh like", value, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhNotLike(String value) {
            addCriterion("lgdzqh not like", value, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhIn(List<String> values) {
            addCriterion("lgdzqh in", values, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhNotIn(List<String> values) {
            addCriterion("lgdzqh not in", values, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhBetween(String value1, String value2) {
            addCriterion("lgdzqh between", value1, value2, "lgdzqh");
            return (Criteria) this;
        }

        public Criteria andLgdzqhNotBetween(String value1, String value2) {
            addCriterion("lgdzqh not between", value1, value2, "lgdzqh");
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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