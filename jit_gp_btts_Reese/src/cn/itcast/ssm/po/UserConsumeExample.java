package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class UserConsumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserConsumeExample() {
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

        public Criteria andUserConsumeIdIsNull() {
            addCriterion("user_consume_id is null");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdIsNotNull() {
            addCriterion("user_consume_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdEqualTo(Integer value) {
            addCriterion("user_consume_id =", value, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdNotEqualTo(Integer value) {
            addCriterion("user_consume_id <>", value, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdGreaterThan(Integer value) {
            addCriterion("user_consume_id >", value, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_consume_id >=", value, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdLessThan(Integer value) {
            addCriterion("user_consume_id <", value, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_consume_id <=", value, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdIn(List<Integer> values) {
            addCriterion("user_consume_id in", values, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdNotIn(List<Integer> values) {
            addCriterion("user_consume_id not in", values, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdBetween(Integer value1, Integer value2) {
            addCriterion("user_consume_id between", value1, value2, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andUserConsumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_consume_id not between", value1, value2, "userConsumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeSumIsNull() {
            addCriterion("consume_sum is null");
            return (Criteria) this;
        }

        public Criteria andConsumeSumIsNotNull() {
            addCriterion("consume_sum is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeSumEqualTo(Float value) {
            addCriterion("consume_sum =", value, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeSumNotEqualTo(Float value) {
            addCriterion("consume_sum <>", value, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeSumGreaterThan(Float value) {
            addCriterion("consume_sum >", value, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeSumGreaterThanOrEqualTo(Float value) {
            addCriterion("consume_sum >=", value, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeSumLessThan(Float value) {
            addCriterion("consume_sum <", value, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeSumLessThanOrEqualTo(Float value) {
            addCriterion("consume_sum <=", value, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeSumIn(List<Float> values) {
            addCriterion("consume_sum in", values, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeSumNotIn(List<Float> values) {
            addCriterion("consume_sum not in", values, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeSumBetween(Float value1, Float value2) {
            addCriterion("consume_sum between", value1, value2, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeSumNotBetween(Float value1, Float value2) {
            addCriterion("consume_sum not between", value1, value2, "consumeSum");
            return (Criteria) this;
        }

        public Criteria andConsumeDisIsNull() {
            addCriterion("consume_dis is null");
            return (Criteria) this;
        }

        public Criteria andConsumeDisIsNotNull() {
            addCriterion("consume_dis is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeDisEqualTo(Float value) {
            addCriterion("consume_dis =", value, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumeDisNotEqualTo(Float value) {
            addCriterion("consume_dis <>", value, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumeDisGreaterThan(Float value) {
            addCriterion("consume_dis >", value, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumeDisGreaterThanOrEqualTo(Float value) {
            addCriterion("consume_dis >=", value, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumeDisLessThan(Float value) {
            addCriterion("consume_dis <", value, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumeDisLessThanOrEqualTo(Float value) {
            addCriterion("consume_dis <=", value, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumeDisIn(List<Float> values) {
            addCriterion("consume_dis in", values, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumeDisNotIn(List<Float> values) {
            addCriterion("consume_dis not in", values, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumeDisBetween(Float value1, Float value2) {
            addCriterion("consume_dis between", value1, value2, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumeDisNotBetween(Float value1, Float value2) {
            addCriterion("consume_dis not between", value1, value2, "consumeDis");
            return (Criteria) this;
        }

        public Criteria andConsumePointsIsNull() {
            addCriterion("consume_points is null");
            return (Criteria) this;
        }

        public Criteria andConsumePointsIsNotNull() {
            addCriterion("consume_points is not null");
            return (Criteria) this;
        }

        public Criteria andConsumePointsEqualTo(Float value) {
            addCriterion("consume_points =", value, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andConsumePointsNotEqualTo(Float value) {
            addCriterion("consume_points <>", value, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andConsumePointsGreaterThan(Float value) {
            addCriterion("consume_points >", value, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andConsumePointsGreaterThanOrEqualTo(Float value) {
            addCriterion("consume_points >=", value, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andConsumePointsLessThan(Float value) {
            addCriterion("consume_points <", value, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andConsumePointsLessThanOrEqualTo(Float value) {
            addCriterion("consume_points <=", value, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andConsumePointsIn(List<Float> values) {
            addCriterion("consume_points in", values, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andConsumePointsNotIn(List<Float> values) {
            addCriterion("consume_points not in", values, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andConsumePointsBetween(Float value1, Float value2) {
            addCriterion("consume_points between", value1, value2, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andConsumePointsNotBetween(Float value1, Float value2) {
            addCriterion("consume_points not between", value1, value2, "consumePoints");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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