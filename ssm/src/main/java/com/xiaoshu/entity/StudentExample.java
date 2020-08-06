package com.xiaoshu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(String value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(String value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(String value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(String value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(String value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(String value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLike(String value) {
            addCriterion("s_sex like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotLike(String value) {
            addCriterion("s_sex not like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<String> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<String> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(String value1, String value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(String value1, String value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSHobbyIsNull() {
            addCriterion("s_hobby is null");
            return (Criteria) this;
        }

        public Criteria andSHobbyIsNotNull() {
            addCriterion("s_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andSHobbyEqualTo(String value) {
            addCriterion("s_hobby =", value, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyNotEqualTo(String value) {
            addCriterion("s_hobby <>", value, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyGreaterThan(String value) {
            addCriterion("s_hobby >", value, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("s_hobby >=", value, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyLessThan(String value) {
            addCriterion("s_hobby <", value, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyLessThanOrEqualTo(String value) {
            addCriterion("s_hobby <=", value, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyLike(String value) {
            addCriterion("s_hobby like", value, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyNotLike(String value) {
            addCriterion("s_hobby not like", value, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyIn(List<String> values) {
            addCriterion("s_hobby in", values, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyNotIn(List<String> values) {
            addCriterion("s_hobby not in", values, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyBetween(String value1, String value2) {
            addCriterion("s_hobby between", value1, value2, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSHobbyNotBetween(String value1, String value2) {
            addCriterion("s_hobby not between", value1, value2, "sHobby");
            return (Criteria) this;
        }

        public Criteria andSBirthIsNull() {
            addCriterion("s_birth is null");
            return (Criteria) this;
        }

        public Criteria andSBirthIsNotNull() {
            addCriterion("s_birth is not null");
            return (Criteria) this;
        }

        public Criteria andSBirthEqualTo(Date value) {
            addCriterionForJDBCDate("s_birth =", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("s_birth <>", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("s_birth >", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_birth >=", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthLessThan(Date value) {
            addCriterionForJDBCDate("s_birth <", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_birth <=", value, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthIn(List<Date> values) {
            addCriterionForJDBCDate("s_birth in", values, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("s_birth not in", values, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_birth between", value1, value2, "sBirth");
            return (Criteria) this;
        }

        public Criteria andSBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_birth not between", value1, value2, "sBirth");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
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