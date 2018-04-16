package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class TransfereeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransfereeInfoExample() {
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

        public Criteria andTransfereeIdIsNull() {
            addCriterion("transferee_id is null");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdIsNotNull() {
            addCriterion("transferee_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdEqualTo(Integer value) {
            addCriterion("transferee_id =", value, "transfereeId");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdNotEqualTo(Integer value) {
            addCriterion("transferee_id <>", value, "transfereeId");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdGreaterThan(Integer value) {
            addCriterion("transferee_id >", value, "transfereeId");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transferee_id >=", value, "transfereeId");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdLessThan(Integer value) {
            addCriterion("transferee_id <", value, "transfereeId");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdLessThanOrEqualTo(Integer value) {
            addCriterion("transferee_id <=", value, "transfereeId");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdIn(List<Integer> values) {
            addCriterion("transferee_id in", values, "transfereeId");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdNotIn(List<Integer> values) {
            addCriterion("transferee_id not in", values, "transfereeId");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdBetween(Integer value1, Integer value2) {
            addCriterion("transferee_id between", value1, value2, "transfereeId");
            return (Criteria) this;
        }

        public Criteria andTransfereeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transferee_id not between", value1, value2, "transfereeId");
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

        public Criteria andInnerBankIsNull() {
            addCriterion("inner_bank is null");
            return (Criteria) this;
        }

        public Criteria andInnerBankIsNotNull() {
            addCriterion("inner_bank is not null");
            return (Criteria) this;
        }

        public Criteria andInnerBankEqualTo(String value) {
            addCriterion("inner_bank =", value, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankNotEqualTo(String value) {
            addCriterion("inner_bank <>", value, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankGreaterThan(String value) {
            addCriterion("inner_bank >", value, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankGreaterThanOrEqualTo(String value) {
            addCriterion("inner_bank >=", value, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankLessThan(String value) {
            addCriterion("inner_bank <", value, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankLessThanOrEqualTo(String value) {
            addCriterion("inner_bank <=", value, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankLike(String value) {
            addCriterion("inner_bank like", value, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankNotLike(String value) {
            addCriterion("inner_bank not like", value, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankIn(List<String> values) {
            addCriterion("inner_bank in", values, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankNotIn(List<String> values) {
            addCriterion("inner_bank not in", values, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankBetween(String value1, String value2) {
            addCriterion("inner_bank between", value1, value2, "innerBank");
            return (Criteria) this;
        }

        public Criteria andInnerBankNotBetween(String value1, String value2) {
            addCriterion("inner_bank not between", value1, value2, "innerBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankIsNull() {
            addCriterion("outter_bank is null");
            return (Criteria) this;
        }

        public Criteria andOutterBankIsNotNull() {
            addCriterion("outter_bank is not null");
            return (Criteria) this;
        }

        public Criteria andOutterBankEqualTo(String value) {
            addCriterion("outter_bank =", value, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankNotEqualTo(String value) {
            addCriterion("outter_bank <>", value, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankGreaterThan(String value) {
            addCriterion("outter_bank >", value, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankGreaterThanOrEqualTo(String value) {
            addCriterion("outter_bank >=", value, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankLessThan(String value) {
            addCriterion("outter_bank <", value, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankLessThanOrEqualTo(String value) {
            addCriterion("outter_bank <=", value, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankLike(String value) {
            addCriterion("outter_bank like", value, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankNotLike(String value) {
            addCriterion("outter_bank not like", value, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankIn(List<String> values) {
            addCriterion("outter_bank in", values, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankNotIn(List<String> values) {
            addCriterion("outter_bank not in", values, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankBetween(String value1, String value2) {
            addCriterion("outter_bank between", value1, value2, "outterBank");
            return (Criteria) this;
        }

        public Criteria andOutterBankNotBetween(String value1, String value2) {
            addCriterion("outter_bank not between", value1, value2, "outterBank");
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