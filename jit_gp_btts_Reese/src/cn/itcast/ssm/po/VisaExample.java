package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class VisaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisaExample() {
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

        public Criteria andVisaIdIsNull() {
            addCriterion("visa_id is null");
            return (Criteria) this;
        }

        public Criteria andVisaIdIsNotNull() {
            addCriterion("visa_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisaIdEqualTo(Integer value) {
            addCriterion("visa_id =", value, "visaId");
            return (Criteria) this;
        }

        public Criteria andVisaIdNotEqualTo(Integer value) {
            addCriterion("visa_id <>", value, "visaId");
            return (Criteria) this;
        }

        public Criteria andVisaIdGreaterThan(Integer value) {
            addCriterion("visa_id >", value, "visaId");
            return (Criteria) this;
        }

        public Criteria andVisaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("visa_id >=", value, "visaId");
            return (Criteria) this;
        }

        public Criteria andVisaIdLessThan(Integer value) {
            addCriterion("visa_id <", value, "visaId");
            return (Criteria) this;
        }

        public Criteria andVisaIdLessThanOrEqualTo(Integer value) {
            addCriterion("visa_id <=", value, "visaId");
            return (Criteria) this;
        }

        public Criteria andVisaIdIn(List<Integer> values) {
            addCriterion("visa_id in", values, "visaId");
            return (Criteria) this;
        }

        public Criteria andVisaIdNotIn(List<Integer> values) {
            addCriterion("visa_id not in", values, "visaId");
            return (Criteria) this;
        }

        public Criteria andVisaIdBetween(Integer value1, Integer value2) {
            addCriterion("visa_id between", value1, value2, "visaId");
            return (Criteria) this;
        }

        public Criteria andVisaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("visa_id not between", value1, value2, "visaId");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrIsNull() {
            addCriterion("double_curr is null");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrIsNotNull() {
            addCriterion("double_curr is not null");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrEqualTo(String value) {
            addCriterion("double_curr =", value, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrNotEqualTo(String value) {
            addCriterion("double_curr <>", value, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrGreaterThan(String value) {
            addCriterion("double_curr >", value, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrGreaterThanOrEqualTo(String value) {
            addCriterion("double_curr >=", value, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrLessThan(String value) {
            addCriterion("double_curr <", value, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrLessThanOrEqualTo(String value) {
            addCriterion("double_curr <=", value, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrLike(String value) {
            addCriterion("double_curr like", value, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrNotLike(String value) {
            addCriterion("double_curr not like", value, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrIn(List<String> values) {
            addCriterion("double_curr in", values, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrNotIn(List<String> values) {
            addCriterion("double_curr not in", values, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrBetween(String value1, String value2) {
            addCriterion("double_curr between", value1, value2, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDoubleCurrNotBetween(String value1, String value2) {
            addCriterion("double_curr not between", value1, value2, "doubleCurr");
            return (Criteria) this;
        }

        public Criteria andDollorIsNull() {
            addCriterion("dollor is null");
            return (Criteria) this;
        }

        public Criteria andDollorIsNotNull() {
            addCriterion("dollor is not null");
            return (Criteria) this;
        }

        public Criteria andDollorEqualTo(String value) {
            addCriterion("dollor =", value, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorNotEqualTo(String value) {
            addCriterion("dollor <>", value, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorGreaterThan(String value) {
            addCriterion("dollor >", value, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorGreaterThanOrEqualTo(String value) {
            addCriterion("dollor >=", value, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorLessThan(String value) {
            addCriterion("dollor <", value, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorLessThanOrEqualTo(String value) {
            addCriterion("dollor <=", value, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorLike(String value) {
            addCriterion("dollor like", value, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorNotLike(String value) {
            addCriterion("dollor not like", value, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorIn(List<String> values) {
            addCriterion("dollor in", values, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorNotIn(List<String> values) {
            addCriterion("dollor not in", values, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorBetween(String value1, String value2) {
            addCriterion("dollor between", value1, value2, "dollor");
            return (Criteria) this;
        }

        public Criteria andDollorNotBetween(String value1, String value2) {
            addCriterion("dollor not between", value1, value2, "dollor");
            return (Criteria) this;
        }

        public Criteria andRmbIsNull() {
            addCriterion("RMB is null");
            return (Criteria) this;
        }

        public Criteria andRmbIsNotNull() {
            addCriterion("RMB is not null");
            return (Criteria) this;
        }

        public Criteria andRmbEqualTo(String value) {
            addCriterion("RMB =", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbNotEqualTo(String value) {
            addCriterion("RMB <>", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbGreaterThan(String value) {
            addCriterion("RMB >", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbGreaterThanOrEqualTo(String value) {
            addCriterion("RMB >=", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbLessThan(String value) {
            addCriterion("RMB <", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbLessThanOrEqualTo(String value) {
            addCriterion("RMB <=", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbLike(String value) {
            addCriterion("RMB like", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbNotLike(String value) {
            addCriterion("RMB not like", value, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbIn(List<String> values) {
            addCriterion("RMB in", values, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbNotIn(List<String> values) {
            addCriterion("RMB not in", values, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbBetween(String value1, String value2) {
            addCriterion("RMB between", value1, value2, "rmb");
            return (Criteria) this;
        }

        public Criteria andRmbNotBetween(String value1, String value2) {
            addCriterion("RMB not between", value1, value2, "rmb");
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