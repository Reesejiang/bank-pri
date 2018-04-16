package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class ThirdPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThirdPayExample() {
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

        public Criteria andOutlandIsNull() {
            addCriterion("outland is null");
            return (Criteria) this;
        }

        public Criteria andOutlandIsNotNull() {
            addCriterion("outland is not null");
            return (Criteria) this;
        }

        public Criteria andOutlandEqualTo(String value) {
            addCriterion("outland =", value, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandNotEqualTo(String value) {
            addCriterion("outland <>", value, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandGreaterThan(String value) {
            addCriterion("outland >", value, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandGreaterThanOrEqualTo(String value) {
            addCriterion("outland >=", value, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandLessThan(String value) {
            addCriterion("outland <", value, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandLessThanOrEqualTo(String value) {
            addCriterion("outland <=", value, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandLike(String value) {
            addCriterion("outland like", value, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandNotLike(String value) {
            addCriterion("outland not like", value, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandIn(List<String> values) {
            addCriterion("outland in", values, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandNotIn(List<String> values) {
            addCriterion("outland not in", values, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandBetween(String value1, String value2) {
            addCriterion("outland between", value1, value2, "outland");
            return (Criteria) this;
        }

        public Criteria andOutlandNotBetween(String value1, String value2) {
            addCriterion("outland not between", value1, value2, "outland");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNull() {
            addCriterion("card_num is null");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNotNull() {
            addCriterion("card_num is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumEqualTo(String value) {
            addCriterion("card_num =", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotEqualTo(String value) {
            addCriterion("card_num <>", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThan(String value) {
            addCriterion("card_num >", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("card_num >=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThan(String value) {
            addCriterion("card_num <", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThanOrEqualTo(String value) {
            addCriterion("card_num <=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLike(String value) {
            addCriterion("card_num like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotLike(String value) {
            addCriterion("card_num not like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumIn(List<String> values) {
            addCriterion("card_num in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotIn(List<String> values) {
            addCriterion("card_num not in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumBetween(String value1, String value2) {
            addCriterion("card_num between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotBetween(String value1, String value2) {
            addCriterion("card_num not between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardPasswardIsNull() {
            addCriterion("card_passward is null");
            return (Criteria) this;
        }

        public Criteria andCardPasswardIsNotNull() {
            addCriterion("card_passward is not null");
            return (Criteria) this;
        }

        public Criteria andCardPasswardEqualTo(String value) {
            addCriterion("card_passward =", value, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardNotEqualTo(String value) {
            addCriterion("card_passward <>", value, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardGreaterThan(String value) {
            addCriterion("card_passward >", value, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardGreaterThanOrEqualTo(String value) {
            addCriterion("card_passward >=", value, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardLessThan(String value) {
            addCriterion("card_passward <", value, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardLessThanOrEqualTo(String value) {
            addCriterion("card_passward <=", value, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardLike(String value) {
            addCriterion("card_passward like", value, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardNotLike(String value) {
            addCriterion("card_passward not like", value, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardIn(List<String> values) {
            addCriterion("card_passward in", values, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardNotIn(List<String> values) {
            addCriterion("card_passward not in", values, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardBetween(String value1, String value2) {
            addCriterion("card_passward between", value1, value2, "cardPassward");
            return (Criteria) this;
        }

        public Criteria andCardPasswardNotBetween(String value1, String value2) {
            addCriterion("card_passward not between", value1, value2, "cardPassward");
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