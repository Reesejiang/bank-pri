package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutterTranLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutterTranLogExample() {
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

        public Criteria andOutterTranTimeIsNull() {
            addCriterion("outter_tran_time is null");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeIsNotNull() {
            addCriterion("outter_tran_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeEqualTo(Date value) {
            addCriterion("outter_tran_time =", value, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeNotEqualTo(Date value) {
            addCriterion("outter_tran_time <>", value, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeGreaterThan(Date value) {
            addCriterion("outter_tran_time >", value, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("outter_tran_time >=", value, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeLessThan(Date value) {
            addCriterion("outter_tran_time <", value, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeLessThanOrEqualTo(Date value) {
            addCriterion("outter_tran_time <=", value, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeIn(List<Date> values) {
            addCriterion("outter_tran_time in", values, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeNotIn(List<Date> values) {
            addCriterion("outter_tran_time not in", values, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeBetween(Date value1, Date value2) {
            addCriterion("outter_tran_time between", value1, value2, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranTimeNotBetween(Date value1, Date value2) {
            addCriterion("outter_tran_time not between", value1, value2, "outterTranTime");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsIsNull() {
            addCriterion("outter_tran_nums is null");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsIsNotNull() {
            addCriterion("outter_tran_nums is not null");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsEqualTo(Float value) {
            addCriterion("outter_tran_nums =", value, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsNotEqualTo(Float value) {
            addCriterion("outter_tran_nums <>", value, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsGreaterThan(Float value) {
            addCriterion("outter_tran_nums >", value, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsGreaterThanOrEqualTo(Float value) {
            addCriterion("outter_tran_nums >=", value, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsLessThan(Float value) {
            addCriterion("outter_tran_nums <", value, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsLessThanOrEqualTo(Float value) {
            addCriterion("outter_tran_nums <=", value, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsIn(List<Float> values) {
            addCriterion("outter_tran_nums in", values, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsNotIn(List<Float> values) {
            addCriterion("outter_tran_nums not in", values, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsBetween(Float value1, Float value2) {
            addCriterion("outter_tran_nums between", value1, value2, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranNumsNotBetween(Float value1, Float value2) {
            addCriterion("outter_tran_nums not between", value1, value2, "outterTranNums");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountIsNull() {
            addCriterion("outter_tran_amount is null");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountIsNotNull() {
            addCriterion("outter_tran_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountEqualTo(String value) {
            addCriterion("outter_tran_amount =", value, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountNotEqualTo(String value) {
            addCriterion("outter_tran_amount <>", value, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountGreaterThan(String value) {
            addCriterion("outter_tran_amount >", value, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountGreaterThanOrEqualTo(String value) {
            addCriterion("outter_tran_amount >=", value, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountLessThan(String value) {
            addCriterion("outter_tran_amount <", value, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountLessThanOrEqualTo(String value) {
            addCriterion("outter_tran_amount <=", value, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountLike(String value) {
            addCriterion("outter_tran_amount like", value, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountNotLike(String value) {
            addCriterion("outter_tran_amount not like", value, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountIn(List<String> values) {
            addCriterion("outter_tran_amount in", values, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountNotIn(List<String> values) {
            addCriterion("outter_tran_amount not in", values, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountBetween(String value1, String value2) {
            addCriterion("outter_tran_amount between", value1, value2, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterTranAmountNotBetween(String value1, String value2) {
            addCriterion("outter_tran_amount not between", value1, value2, "outterTranAmount");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeIsNull() {
            addCriterion("outter_service_charge is null");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeIsNotNull() {
            addCriterion("outter_service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeEqualTo(String value) {
            addCriterion("outter_service_charge =", value, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeNotEqualTo(String value) {
            addCriterion("outter_service_charge <>", value, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeGreaterThan(String value) {
            addCriterion("outter_service_charge >", value, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeGreaterThanOrEqualTo(String value) {
            addCriterion("outter_service_charge >=", value, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeLessThan(String value) {
            addCriterion("outter_service_charge <", value, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeLessThanOrEqualTo(String value) {
            addCriterion("outter_service_charge <=", value, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeLike(String value) {
            addCriterion("outter_service_charge like", value, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeNotLike(String value) {
            addCriterion("outter_service_charge not like", value, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeIn(List<String> values) {
            addCriterion("outter_service_charge in", values, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeNotIn(List<String> values) {
            addCriterion("outter_service_charge not in", values, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeBetween(String value1, String value2) {
            addCriterion("outter_service_charge between", value1, value2, "outterServiceCharge");
            return (Criteria) this;
        }

        public Criteria andOutterServiceChargeNotBetween(String value1, String value2) {
            addCriterion("outter_service_charge not between", value1, value2, "outterServiceCharge");
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