package com.xafdy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendanceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public AttendanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNull() {
            addCriterion("record_date is null");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNotNull() {
            addCriterion("record_date is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDateEqualTo(Date value) {
            addCriterionForJDBCDate("record_date =", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("record_date <>", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThan(Date value) {
            addCriterionForJDBCDate("record_date >", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_date >=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThan(Date value) {
            addCriterionForJDBCDate("record_date <", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_date <=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateIn(List<Date> values) {
            addCriterionForJDBCDate("record_date in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("record_date not in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_date between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_date not between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andLeaveIsNull() {
            addCriterion("leave is null");
            return (Criteria) this;
        }

        public Criteria andLeaveIsNotNull() {
            addCriterion("leave is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveEqualTo(Double value) {
            addCriterion("leave =", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveNotEqualTo(Double value) {
            addCriterion("leave <>", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveGreaterThan(Double value) {
            addCriterion("leave >", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveGreaterThanOrEqualTo(Double value) {
            addCriterion("leave >=", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveLessThan(Double value) {
            addCriterion("leave <", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveLessThanOrEqualTo(Double value) {
            addCriterion("leave <=", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveIn(List<Double> values) {
            addCriterion("leave in", values, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveNotIn(List<Double> values) {
            addCriterion("leave not in", values, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveBetween(Double value1, Double value2) {
            addCriterion("leave between", value1, value2, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveNotBetween(Double value1, Double value2) {
            addCriterion("leave not between", value1, value2, "leave");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismIsNull() {
            addCriterion("absenteeism is null");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismIsNotNull() {
            addCriterion("absenteeism is not null");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismEqualTo(Double value) {
            addCriterion("absenteeism =", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismNotEqualTo(Double value) {
            addCriterion("absenteeism <>", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismGreaterThan(Double value) {
            addCriterion("absenteeism >", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismGreaterThanOrEqualTo(Double value) {
            addCriterion("absenteeism >=", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismLessThan(Double value) {
            addCriterion("absenteeism <", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismLessThanOrEqualTo(Double value) {
            addCriterion("absenteeism <=", value, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismIn(List<Double> values) {
            addCriterion("absenteeism in", values, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismNotIn(List<Double> values) {
            addCriterion("absenteeism not in", values, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismBetween(Double value1, Double value2) {
            addCriterion("absenteeism between", value1, value2, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andAbsenteeismNotBetween(Double value1, Double value2) {
            addCriterion("absenteeism not between", value1, value2, "absenteeism");
            return (Criteria) this;
        }

        public Criteria andVacationIsNull() {
            addCriterion("vacation is null");
            return (Criteria) this;
        }

        public Criteria andVacationIsNotNull() {
            addCriterion("vacation is not null");
            return (Criteria) this;
        }

        public Criteria andVacationEqualTo(Double value) {
            addCriterion("vacation =", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationNotEqualTo(Double value) {
            addCriterion("vacation <>", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationGreaterThan(Double value) {
            addCriterion("vacation >", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationGreaterThanOrEqualTo(Double value) {
            addCriterion("vacation >=", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationLessThan(Double value) {
            addCriterion("vacation <", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationLessThanOrEqualTo(Double value) {
            addCriterion("vacation <=", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationIn(List<Double> values) {
            addCriterion("vacation in", values, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationNotIn(List<Double> values) {
            addCriterion("vacation not in", values, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationBetween(Double value1, Double value2) {
            addCriterion("vacation between", value1, value2, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationNotBetween(Double value1, Double value2) {
            addCriterion("vacation not between", value1, value2, "vacation");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(Double value) {
            addCriterion("real_amount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(Double value) {
            addCriterion("real_amount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(Double value) {
            addCriterion("real_amount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("real_amount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(Double value) {
            addCriterion("real_amount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(Double value) {
            addCriterion("real_amount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<Double> values) {
            addCriterion("real_amount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<Double> values) {
            addCriterion("real_amount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(Double value1, Double value2) {
            addCriterion("real_amount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(Double value1, Double value2) {
            addCriterion("real_amount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attendance
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 11 20:22:07 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attendance
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
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