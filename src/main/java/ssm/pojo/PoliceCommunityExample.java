package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoliceCommunityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoliceCommunityExample() {
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

        public Criteria andJjdbhIsNull() {
            addCriterion("jjdbh is null");
            return (Criteria) this;
        }

        public Criteria andJjdbhIsNotNull() {
            addCriterion("jjdbh is not null");
            return (Criteria) this;
        }

        public Criteria andJjdbhEqualTo(String value) {
            addCriterion("jjdbh =", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhNotEqualTo(String value) {
            addCriterion("jjdbh <>", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhGreaterThan(String value) {
            addCriterion("jjdbh >", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhGreaterThanOrEqualTo(String value) {
            addCriterion("jjdbh >=", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhLessThan(String value) {
            addCriterion("jjdbh <", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhLessThanOrEqualTo(String value) {
            addCriterion("jjdbh <=", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhLike(String value) {
            addCriterion("jjdbh like", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhNotLike(String value) {
            addCriterion("jjdbh not like", value, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhIn(List<String> values) {
            addCriterion("jjdbh in", values, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhNotIn(List<String> values) {
            addCriterion("jjdbh not in", values, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhBetween(String value1, String value2) {
            addCriterion("jjdbh between", value1, value2, "jjdbh");
            return (Criteria) this;
        }

        public Criteria andJjdbhNotBetween(String value1, String value2) {
            addCriterion("jjdbh not between", value1, value2, "jjdbh");
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

        public Criteria andJdIsNull() {
            addCriterion("jd is null");
            return (Criteria) this;
        }

        public Criteria andJdIsNotNull() {
            addCriterion("jd is not null");
            return (Criteria) this;
        }

        public Criteria andJdEqualTo(String value) {
            addCriterion("jd =", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotEqualTo(String value) {
            addCriterion("jd <>", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThan(String value) {
            addCriterion("jd >", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThanOrEqualTo(String value) {
            addCriterion("jd >=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThan(String value) {
            addCriterion("jd <", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThanOrEqualTo(String value) {
            addCriterion("jd <=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLike(String value) {
            addCriterion("jd like", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotLike(String value) {
            addCriterion("jd not like", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdIn(List<String> values) {
            addCriterion("jd in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotIn(List<String> values) {
            addCriterion("jd not in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdBetween(String value1, String value2) {
            addCriterion("jd between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotBetween(String value1, String value2) {
            addCriterion("jd not between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andWdIsNull() {
            addCriterion("wd is null");
            return (Criteria) this;
        }

        public Criteria andWdIsNotNull() {
            addCriterion("wd is not null");
            return (Criteria) this;
        }

        public Criteria andWdEqualTo(String value) {
            addCriterion("wd =", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotEqualTo(String value) {
            addCriterion("wd <>", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThan(String value) {
            addCriterion("wd >", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThanOrEqualTo(String value) {
            addCriterion("wd >=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThan(String value) {
            addCriterion("wd <", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThanOrEqualTo(String value) {
            addCriterion("wd <=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLike(String value) {
            addCriterion("wd like", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotLike(String value) {
            addCriterion("wd not like", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdIn(List<String> values) {
            addCriterion("wd in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotIn(List<String> values) {
            addCriterion("wd not in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdBetween(String value1, String value2) {
            addCriterion("wd between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotBetween(String value1, String value2) {
            addCriterion("wd not between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andGxdwdmIsNull() {
            addCriterion("gxdwdm is null");
            return (Criteria) this;
        }

        public Criteria andGxdwdmIsNotNull() {
            addCriterion("gxdwdm is not null");
            return (Criteria) this;
        }

        public Criteria andGxdwdmEqualTo(String value) {
            addCriterion("gxdwdm =", value, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmNotEqualTo(String value) {
            addCriterion("gxdwdm <>", value, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmGreaterThan(String value) {
            addCriterion("gxdwdm >", value, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmGreaterThanOrEqualTo(String value) {
            addCriterion("gxdwdm >=", value, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmLessThan(String value) {
            addCriterion("gxdwdm <", value, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmLessThanOrEqualTo(String value) {
            addCriterion("gxdwdm <=", value, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmLike(String value) {
            addCriterion("gxdwdm like", value, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmNotLike(String value) {
            addCriterion("gxdwdm not like", value, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmIn(List<String> values) {
            addCriterion("gxdwdm in", values, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmNotIn(List<String> values) {
            addCriterion("gxdwdm not in", values, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmBetween(String value1, String value2) {
            addCriterion("gxdwdm between", value1, value2, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andGxdwdmNotBetween(String value1, String value2) {
            addCriterion("gxdwdm not between", value1, value2, "gxdwdm");
            return (Criteria) this;
        }

        public Criteria andAfddIsNull() {
            addCriterion("afdd is null");
            return (Criteria) this;
        }

        public Criteria andAfddIsNotNull() {
            addCriterion("afdd is not null");
            return (Criteria) this;
        }

        public Criteria andAfddEqualTo(String value) {
            addCriterion("afdd =", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddNotEqualTo(String value) {
            addCriterion("afdd <>", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddGreaterThan(String value) {
            addCriterion("afdd >", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddGreaterThanOrEqualTo(String value) {
            addCriterion("afdd >=", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddLessThan(String value) {
            addCriterion("afdd <", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddLessThanOrEqualTo(String value) {
            addCriterion("afdd <=", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddLike(String value) {
            addCriterion("afdd like", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddNotLike(String value) {
            addCriterion("afdd not like", value, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddIn(List<String> values) {
            addCriterion("afdd in", values, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddNotIn(List<String> values) {
            addCriterion("afdd not in", values, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddBetween(String value1, String value2) {
            addCriterion("afdd between", value1, value2, "afdd");
            return (Criteria) this;
        }

        public Criteria andAfddNotBetween(String value1, String value2) {
            addCriterion("afdd not between", value1, value2, "afdd");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNull() {
            addCriterion("bjsj is null");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNotNull() {
            addCriterion("bjsj is not null");
            return (Criteria) this;
        }

        public Criteria andBjsjEqualTo(String value) {
            addCriterion("bjsj =", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotEqualTo(String value) {
            addCriterion("bjsj <>", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThan(String value) {
            addCriterion("bjsj >", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThanOrEqualTo(String value) {
            addCriterion("bjsj >=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThan(String value) {
            addCriterion("bjsj <", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThanOrEqualTo(String value) {
            addCriterion("bjsj <=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLike(String value) {
            addCriterion("bjsj like", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotLike(String value) {
            addCriterion("bjsj not like", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjIn(List<String> values) {
            addCriterion("bjsj in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotIn(List<String> values) {
            addCriterion("bjsj not in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjBetween(String value1, String value2) {
            addCriterion("bjsj between", value1, value2, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotBetween(String value1, String value2) {
            addCriterion("bjsj not between", value1, value2, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjlbdmIsNull() {
            addCriterion("bjlbdm is null");
            return (Criteria) this;
        }

        public Criteria andBjlbdmIsNotNull() {
            addCriterion("bjlbdm is not null");
            return (Criteria) this;
        }

        public Criteria andBjlbdmEqualTo(String value) {
            addCriterion("bjlbdm =", value, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmNotEqualTo(String value) {
            addCriterion("bjlbdm <>", value, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmGreaterThan(String value) {
            addCriterion("bjlbdm >", value, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmGreaterThanOrEqualTo(String value) {
            addCriterion("bjlbdm >=", value, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmLessThan(String value) {
            addCriterion("bjlbdm <", value, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmLessThanOrEqualTo(String value) {
            addCriterion("bjlbdm <=", value, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmLike(String value) {
            addCriterion("bjlbdm like", value, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmNotLike(String value) {
            addCriterion("bjlbdm not like", value, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmIn(List<String> values) {
            addCriterion("bjlbdm in", values, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmNotIn(List<String> values) {
            addCriterion("bjlbdm not in", values, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmBetween(String value1, String value2) {
            addCriterion("bjlbdm between", value1, value2, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlbdmNotBetween(String value1, String value2) {
            addCriterion("bjlbdm not between", value1, value2, "bjlbdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmIsNull() {
            addCriterion("bjlxdm is null");
            return (Criteria) this;
        }

        public Criteria andBjlxdmIsNotNull() {
            addCriterion("bjlxdm is not null");
            return (Criteria) this;
        }

        public Criteria andBjlxdmEqualTo(String value) {
            addCriterion("bjlxdm =", value, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmNotEqualTo(String value) {
            addCriterion("bjlxdm <>", value, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmGreaterThan(String value) {
            addCriterion("bjlxdm >", value, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("bjlxdm >=", value, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmLessThan(String value) {
            addCriterion("bjlxdm <", value, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmLessThanOrEqualTo(String value) {
            addCriterion("bjlxdm <=", value, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmLike(String value) {
            addCriterion("bjlxdm like", value, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmNotLike(String value) {
            addCriterion("bjlxdm not like", value, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmIn(List<String> values) {
            addCriterion("bjlxdm in", values, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmNotIn(List<String> values) {
            addCriterion("bjlxdm not in", values, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmBetween(String value1, String value2) {
            addCriterion("bjlxdm between", value1, value2, "bjlxdm");
            return (Criteria) this;
        }

        public Criteria andBjlxdmNotBetween(String value1, String value2) {
            addCriterion("bjlxdm not between", value1, value2, "bjlxdm");
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