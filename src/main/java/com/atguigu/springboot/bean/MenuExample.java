package com.atguigu.springboot.bean;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMurlIsNull() {
            addCriterion("murl is null");
            return (Criteria) this;
        }

        public Criteria andMurlIsNotNull() {
            addCriterion("murl is not null");
            return (Criteria) this;
        }

        public Criteria andMurlEqualTo(String value) {
            addCriterion("murl =", value, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlNotEqualTo(String value) {
            addCriterion("murl <>", value, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlGreaterThan(String value) {
            addCriterion("murl >", value, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlGreaterThanOrEqualTo(String value) {
            addCriterion("murl >=", value, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlLessThan(String value) {
            addCriterion("murl <", value, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlLessThanOrEqualTo(String value) {
            addCriterion("murl <=", value, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlLike(String value) {
            addCriterion("murl like", value, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlNotLike(String value) {
            addCriterion("murl not like", value, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlIn(List<String> values) {
            addCriterion("murl in", values, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlNotIn(List<String> values) {
            addCriterion("murl not in", values, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlBetween(String value1, String value2) {
            addCriterion("murl between", value1, value2, "murl");
            return (Criteria) this;
        }

        public Criteria andMurlNotBetween(String value1, String value2) {
            addCriterion("murl not between", value1, value2, "murl");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNull() {
            addCriterion("mtype is null");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNotNull() {
            addCriterion("mtype is not null");
            return (Criteria) this;
        }

        public Criteria andMtypeEqualTo(String value) {
            addCriterion("mtype =", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotEqualTo(String value) {
            addCriterion("mtype <>", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThan(String value) {
            addCriterion("mtype >", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThanOrEqualTo(String value) {
            addCriterion("mtype >=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThan(String value) {
            addCriterion("mtype <", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThanOrEqualTo(String value) {
            addCriterion("mtype <=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLike(String value) {
            addCriterion("mtype like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotLike(String value) {
            addCriterion("mtype not like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeIn(List<String> values) {
            addCriterion("mtype in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotIn(List<String> values) {
            addCriterion("mtype not in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeBetween(String value1, String value2) {
            addCriterion("mtype between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotBetween(String value1, String value2) {
            addCriterion("mtype not between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMmaterialIsNull() {
            addCriterion("mmaterial is null");
            return (Criteria) this;
        }

        public Criteria andMmaterialIsNotNull() {
            addCriterion("mmaterial is not null");
            return (Criteria) this;
        }

        public Criteria andMmaterialEqualTo(String value) {
            addCriterion("mmaterial =", value, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialNotEqualTo(String value) {
            addCriterion("mmaterial <>", value, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialGreaterThan(String value) {
            addCriterion("mmaterial >", value, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialGreaterThanOrEqualTo(String value) {
            addCriterion("mmaterial >=", value, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialLessThan(String value) {
            addCriterion("mmaterial <", value, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialLessThanOrEqualTo(String value) {
            addCriterion("mmaterial <=", value, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialLike(String value) {
            addCriterion("mmaterial like", value, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialNotLike(String value) {
            addCriterion("mmaterial not like", value, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialIn(List<String> values) {
            addCriterion("mmaterial in", values, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialNotIn(List<String> values) {
            addCriterion("mmaterial not in", values, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialBetween(String value1, String value2) {
            addCriterion("mmaterial between", value1, value2, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMmaterialNotBetween(String value1, String value2) {
            addCriterion("mmaterial not between", value1, value2, "mmaterial");
            return (Criteria) this;
        }

        public Criteria andMtasteIsNull() {
            addCriterion("mtaste is null");
            return (Criteria) this;
        }

        public Criteria andMtasteIsNotNull() {
            addCriterion("mtaste is not null");
            return (Criteria) this;
        }

        public Criteria andMtasteEqualTo(String value) {
            addCriterion("mtaste =", value, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteNotEqualTo(String value) {
            addCriterion("mtaste <>", value, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteGreaterThan(String value) {
            addCriterion("mtaste >", value, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteGreaterThanOrEqualTo(String value) {
            addCriterion("mtaste >=", value, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteLessThan(String value) {
            addCriterion("mtaste <", value, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteLessThanOrEqualTo(String value) {
            addCriterion("mtaste <=", value, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteLike(String value) {
            addCriterion("mtaste like", value, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteNotLike(String value) {
            addCriterion("mtaste not like", value, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteIn(List<String> values) {
            addCriterion("mtaste in", values, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteNotIn(List<String> values) {
            addCriterion("mtaste not in", values, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteBetween(String value1, String value2) {
            addCriterion("mtaste between", value1, value2, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMtasteNotBetween(String value1, String value2) {
            addCriterion("mtaste not between", value1, value2, "mtaste");
            return (Criteria) this;
        }

        public Criteria andMaddtimeIsNull() {
            addCriterion("maddtime is null");
            return (Criteria) this;
        }

        public Criteria andMaddtimeIsNotNull() {
            addCriterion("maddtime is not null");
            return (Criteria) this;
        }

        public Criteria andMaddtimeEqualTo(String value) {
            addCriterion("maddtime =", value, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeNotEqualTo(String value) {
            addCriterion("maddtime <>", value, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeGreaterThan(String value) {
            addCriterion("maddtime >", value, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("maddtime >=", value, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeLessThan(String value) {
            addCriterion("maddtime <", value, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeLessThanOrEqualTo(String value) {
            addCriterion("maddtime <=", value, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeLike(String value) {
            addCriterion("maddtime like", value, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeNotLike(String value) {
            addCriterion("maddtime not like", value, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeIn(List<String> values) {
            addCriterion("maddtime in", values, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeNotIn(List<String> values) {
            addCriterion("maddtime not in", values, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeBetween(String value1, String value2) {
            addCriterion("maddtime between", value1, value2, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMaddtimeNotBetween(String value1, String value2) {
            addCriterion("maddtime not between", value1, value2, "maddtime");
            return (Criteria) this;
        }

        public Criteria andMscoreIsNull() {
            addCriterion("mscore is null");
            return (Criteria) this;
        }

        public Criteria andMscoreIsNotNull() {
            addCriterion("mscore is not null");
            return (Criteria) this;
        }

        public Criteria andMscoreEqualTo(String value) {
            addCriterion("mscore =", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotEqualTo(String value) {
            addCriterion("mscore <>", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreGreaterThan(String value) {
            addCriterion("mscore >", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreGreaterThanOrEqualTo(String value) {
            addCriterion("mscore >=", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreLessThan(String value) {
            addCriterion("mscore <", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreLessThanOrEqualTo(String value) {
            addCriterion("mscore <=", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreLike(String value) {
            addCriterion("mscore like", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotLike(String value) {
            addCriterion("mscore not like", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreIn(List<String> values) {
            addCriterion("mscore in", values, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotIn(List<String> values) {
            addCriterion("mscore not in", values, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreBetween(String value1, String value2) {
            addCriterion("mscore between", value1, value2, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotBetween(String value1, String value2) {
            addCriterion("mscore not between", value1, value2, "mscore");
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