package com.letv.cdn.openapi.pojo;

import java.util.ArrayList;
import java.util.List;

public class PreDistParamExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    protected int[] limit = new int[] {-1, -1};

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public PreDistParamExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
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
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public void setLimitValue1(int val) {
        this.limit[0] = val;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public void setLimitValue2(int val) {
        this.limit[1] = val;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public int getLimitValue1() {
        return this.limit[0];
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
     */
    public int getLimitValue2() {
        return this.limit[1];
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
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

        public Criteria andAppkeyIsNull() {
            addCriterion("appkey is null");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNotNull() {
            addCriterion("appkey is not null");
            return (Criteria) this;
        }

        public Criteria andAppkeyEqualTo(String value) {
            addCriterion("appkey =", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotEqualTo(String value) {
            addCriterion("appkey <>", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThan(String value) {
            addCriterion("appkey >", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
            addCriterion("appkey >=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThan(String value) {
            addCriterion("appkey <", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThanOrEqualTo(String value) {
            addCriterion("appkey <=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLike(String value) {
            addCriterion("appkey like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotLike(String value) {
            addCriterion("appkey not like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyIn(List<String> values) {
            addCriterion("appkey in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotIn(List<String> values) {
            addCriterion("appkey not in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyBetween(String value1, String value2) {
            addCriterion("appkey between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotBetween(String value1, String value2) {
            addCriterion("appkey not between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andPropIsNull() {
            addCriterion("prop is null");
            return (Criteria) this;
        }

        public Criteria andPropIsNotNull() {
            addCriterion("prop is not null");
            return (Criteria) this;
        }

        public Criteria andPropEqualTo(String value) {
            addCriterion("prop =", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropNotEqualTo(String value) {
            addCriterion("prop <>", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropGreaterThan(String value) {
            addCriterion("prop >", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropGreaterThanOrEqualTo(String value) {
            addCriterion("prop >=", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropLessThan(String value) {
            addCriterion("prop <", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropLessThanOrEqualTo(String value) {
            addCriterion("prop <=", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropLike(String value) {
            addCriterion("prop like", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropNotLike(String value) {
            addCriterion("prop not like", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropIn(List<String> values) {
            addCriterion("prop in", values, "prop");
            return (Criteria) this;
        }

        public Criteria andPropNotIn(List<String> values) {
            addCriterion("prop not in", values, "prop");
            return (Criteria) this;
        }

        public Criteria andPropBetween(String value1, String value2) {
            addCriterion("prop between", value1, value2, "prop");
            return (Criteria) this;
        }

        public Criteria andPropNotBetween(String value1, String value2) {
            addCriterion("prop not between", value1, value2, "prop");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andCallbackIsNull() {
            addCriterion("callback is null");
            return (Criteria) this;
        }

        public Criteria andCallbackIsNotNull() {
            addCriterion("callback is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackEqualTo(String value) {
            addCriterion("callback =", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotEqualTo(String value) {
            addCriterion("callback <>", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackGreaterThan(String value) {
            addCriterion("callback >", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackGreaterThanOrEqualTo(String value) {
            addCriterion("callback >=", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackLessThan(String value) {
            addCriterion("callback <", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackLessThanOrEqualTo(String value) {
            addCriterion("callback <=", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackLike(String value) {
            addCriterion("callback like", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotLike(String value) {
            addCriterion("callback not like", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackIn(List<String> values) {
            addCriterion("callback in", values, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotIn(List<String> values) {
            addCriterion("callback not in", values, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackBetween(String value1, String value2) {
            addCriterion("callback between", value1, value2, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotBetween(String value1, String value2) {
            addCriterion("callback not between", value1, value2, "callback");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
        
        public Criteria andCallbackModeEqualTo(byte value) {
            addCriterion("callback_mode =", value, "callbackMode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pre_dist_param
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 04 17:39:04 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pre_dist_param
     *
     * @mbggenerated Sun Jan 04 17:39:04 CST 2015
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