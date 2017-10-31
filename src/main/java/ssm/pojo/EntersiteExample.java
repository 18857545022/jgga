package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class EntersiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EntersiteExample() {
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

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andLegalIsNull() {
            addCriterion("legal is null");
            return (Criteria) this;
        }

        public Criteria andLegalIsNotNull() {
            addCriterion("legal is not null");
            return (Criteria) this;
        }

        public Criteria andLegalEqualTo(String value) {
            addCriterion("legal =", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotEqualTo(String value) {
            addCriterion("legal <>", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalGreaterThan(String value) {
            addCriterion("legal >", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalGreaterThanOrEqualTo(String value) {
            addCriterion("legal >=", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalLessThan(String value) {
            addCriterion("legal <", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalLessThanOrEqualTo(String value) {
            addCriterion("legal <=", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalLike(String value) {
            addCriterion("legal like", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotLike(String value) {
            addCriterion("legal not like", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalIn(List<String> values) {
            addCriterion("legal in", values, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotIn(List<String> values) {
            addCriterion("legal not in", values, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalBetween(String value1, String value2) {
            addCriterion("legal between", value1, value2, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotBetween(String value1, String value2) {
            addCriterion("legal not between", value1, value2, "legal");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andProprietorIsNull() {
            addCriterion("proprietor is null");
            return (Criteria) this;
        }

        public Criteria andProprietorIsNotNull() {
            addCriterion("proprietor is not null");
            return (Criteria) this;
        }

        public Criteria andProprietorEqualTo(String value) {
            addCriterion("proprietor =", value, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorNotEqualTo(String value) {
            addCriterion("proprietor <>", value, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorGreaterThan(String value) {
            addCriterion("proprietor >", value, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorGreaterThanOrEqualTo(String value) {
            addCriterion("proprietor >=", value, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorLessThan(String value) {
            addCriterion("proprietor <", value, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorLessThanOrEqualTo(String value) {
            addCriterion("proprietor <=", value, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorLike(String value) {
            addCriterion("proprietor like", value, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorNotLike(String value) {
            addCriterion("proprietor not like", value, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorIn(List<String> values) {
            addCriterion("proprietor in", values, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorNotIn(List<String> values) {
            addCriterion("proprietor not in", values, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorBetween(String value1, String value2) {
            addCriterion("proprietor between", value1, value2, "proprietor");
            return (Criteria) this;
        }

        public Criteria andProprietorNotBetween(String value1, String value2) {
            addCriterion("proprietor not between", value1, value2, "proprietor");
            return (Criteria) this;
        }

        public Criteria andPhoneProIsNull() {
            addCriterion("phone_pro is null");
            return (Criteria) this;
        }

        public Criteria andPhoneProIsNotNull() {
            addCriterion("phone_pro is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneProEqualTo(String value) {
            addCriterion("phone_pro =", value, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProNotEqualTo(String value) {
            addCriterion("phone_pro <>", value, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProGreaterThan(String value) {
            addCriterion("phone_pro >", value, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProGreaterThanOrEqualTo(String value) {
            addCriterion("phone_pro >=", value, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProLessThan(String value) {
            addCriterion("phone_pro <", value, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProLessThanOrEqualTo(String value) {
            addCriterion("phone_pro <=", value, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProLike(String value) {
            addCriterion("phone_pro like", value, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProNotLike(String value) {
            addCriterion("phone_pro not like", value, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProIn(List<String> values) {
            addCriterion("phone_pro in", values, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProNotIn(List<String> values) {
            addCriterion("phone_pro not in", values, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProBetween(String value1, String value2) {
            addCriterion("phone_pro between", value1, value2, "phonePro");
            return (Criteria) this;
        }

        public Criteria andPhoneProNotBetween(String value1, String value2) {
            addCriterion("phone_pro not between", value1, value2, "phonePro");
            return (Criteria) this;
        }

        public Criteria andEmploynumIsNull() {
            addCriterion("employnum is null");
            return (Criteria) this;
        }

        public Criteria andEmploynumIsNotNull() {
            addCriterion("employnum is not null");
            return (Criteria) this;
        }

        public Criteria andEmploynumEqualTo(String value) {
            addCriterion("employnum =", value, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumNotEqualTo(String value) {
            addCriterion("employnum <>", value, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumGreaterThan(String value) {
            addCriterion("employnum >", value, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumGreaterThanOrEqualTo(String value) {
            addCriterion("employnum >=", value, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumLessThan(String value) {
            addCriterion("employnum <", value, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumLessThanOrEqualTo(String value) {
            addCriterion("employnum <=", value, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumLike(String value) {
            addCriterion("employnum like", value, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumNotLike(String value) {
            addCriterion("employnum not like", value, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumIn(List<String> values) {
            addCriterion("employnum in", values, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumNotIn(List<String> values) {
            addCriterion("employnum not in", values, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumBetween(String value1, String value2) {
            addCriterion("employnum between", value1, value2, "employnum");
            return (Criteria) this;
        }

        public Criteria andEmploynumNotBetween(String value1, String value2) {
            addCriterion("employnum not between", value1, value2, "employnum");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andIspornographyIsNull() {
            addCriterion("isPornography is null");
            return (Criteria) this;
        }

        public Criteria andIspornographyIsNotNull() {
            addCriterion("isPornography is not null");
            return (Criteria) this;
        }

        public Criteria andIspornographyEqualTo(String value) {
            addCriterion("isPornography =", value, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyNotEqualTo(String value) {
            addCriterion("isPornography <>", value, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyGreaterThan(String value) {
            addCriterion("isPornography >", value, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyGreaterThanOrEqualTo(String value) {
            addCriterion("isPornography >=", value, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyLessThan(String value) {
            addCriterion("isPornography <", value, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyLessThanOrEqualTo(String value) {
            addCriterion("isPornography <=", value, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyLike(String value) {
            addCriterion("isPornography like", value, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyNotLike(String value) {
            addCriterion("isPornography not like", value, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyIn(List<String> values) {
            addCriterion("isPornography in", values, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyNotIn(List<String> values) {
            addCriterion("isPornography not in", values, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyBetween(String value1, String value2) {
            addCriterion("isPornography between", value1, value2, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIspornographyNotBetween(String value1, String value2) {
            addCriterion("isPornography not between", value1, value2, "ispornography");
            return (Criteria) this;
        }

        public Criteria andIscloseIsNull() {
            addCriterion("isClose is null");
            return (Criteria) this;
        }

        public Criteria andIscloseIsNotNull() {
            addCriterion("isClose is not null");
            return (Criteria) this;
        }

        public Criteria andIscloseEqualTo(String value) {
            addCriterion("isClose =", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseNotEqualTo(String value) {
            addCriterion("isClose <>", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseGreaterThan(String value) {
            addCriterion("isClose >", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseGreaterThanOrEqualTo(String value) {
            addCriterion("isClose >=", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseLessThan(String value) {
            addCriterion("isClose <", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseLessThanOrEqualTo(String value) {
            addCriterion("isClose <=", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseLike(String value) {
            addCriterion("isClose like", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseNotLike(String value) {
            addCriterion("isClose not like", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseIn(List<String> values) {
            addCriterion("isClose in", values, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseNotIn(List<String> values) {
            addCriterion("isClose not in", values, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseBetween(String value1, String value2) {
            addCriterion("isClose between", value1, value2, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseNotBetween(String value1, String value2) {
            addCriterion("isClose not between", value1, value2, "isclose");
            return (Criteria) this;
        }

        public Criteria andIsdetentionIsNull() {
            addCriterion("isDetention is null");
            return (Criteria) this;
        }

        public Criteria andIsdetentionIsNotNull() {
            addCriterion("isDetention is not null");
            return (Criteria) this;
        }

        public Criteria andIsdetentionEqualTo(String value) {
            addCriterion("isDetention =", value, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionNotEqualTo(String value) {
            addCriterion("isDetention <>", value, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionGreaterThan(String value) {
            addCriterion("isDetention >", value, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionGreaterThanOrEqualTo(String value) {
            addCriterion("isDetention >=", value, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionLessThan(String value) {
            addCriterion("isDetention <", value, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionLessThanOrEqualTo(String value) {
            addCriterion("isDetention <=", value, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionLike(String value) {
            addCriterion("isDetention like", value, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionNotLike(String value) {
            addCriterion("isDetention not like", value, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionIn(List<String> values) {
            addCriterion("isDetention in", values, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionNotIn(List<String> values) {
            addCriterion("isDetention not in", values, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionBetween(String value1, String value2) {
            addCriterion("isDetention between", value1, value2, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdetentionNotBetween(String value1, String value2) {
            addCriterion("isDetention not between", value1, value2, "isdetention");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
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