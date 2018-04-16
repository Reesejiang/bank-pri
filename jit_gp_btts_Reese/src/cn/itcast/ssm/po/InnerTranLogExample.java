package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InnerTranLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnerTranLogExample() {
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

        public Criteria andInnerTranTimeIsNull() {
            addCriterion("inner_tran_time is null");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeIsNotNull() {
            addCriterion("inner_tran_time is not null");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeEqualTo(Date value) {
            addCriterion("inner_tran_time =", value, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeNotEqualTo(Date value) {
            addCriterion("inner_tran_time <>", value, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeGreaterThan(Date value) {
            addCriterion("inner_tran_time >", value, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inner_tran_time >=", value, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeLessThan(Date value) {
            addCriterion("inner_tran_time <", value, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeLessThanOrEqualTo(Date value) {
            addCriterion("inner_tran_time <=", value, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeIn(List<Date> values) {
            addCriterion("inner_tran_time in", values, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeNotIn(List<Date> values) {
            addCriterion("inner_tran_time not in", values, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeBetween(Date value1, Date value2) {
            addCriterion("inner_tran_time between", value1, value2, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranTimeNotBetween(Date value1, Date value2) {
            addCriterion("inner_tran_time not between", value1, value2, "innerTranTime");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsIsNull() {
            addCriterion("inner_tran_nums is null");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsIsNotNull() {
            addCriterion("inner_tran_nums is not null");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsEqualTo(Float value) {
            addCriterion("inner_tran_nums =", value, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsNotEqualTo(Float value) {
            addCriterion("inner_tran_nums <>", value, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsGreaterThan(Float value) {
            addCriterion("inner_tran_nums >", value, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsGreaterThanOrEqualTo(Float value) {
            addCriterion("inner_tran_nums >=", value, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsLessThan(Float value) {
            addCriterion("inner_tran_nums <", value, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsLessThanOrEqualTo(Float value) {
            addCriterion("inner_tran_nums <=", value, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsIn(List<Float> values) {
            addCriterion("inner_tran_nums in", values, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsNotIn(List<Float> values) {
            addCriterion("inner_tran_nums not in", values, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsBetween(Float value1, Float value2) {
            addCriterion("inner_tran_nums between", value1, value2, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranNumsNotBetween(Float value1, Float value2) {
            addCriterion("inner_tran_nums not between", value1, value2, "innerTranNums");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountIsNull() {
            addCriterion("inner_tran_amount is null");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountIsNotNull() {
            addCriterion("inner_tran_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountEqualTo(String value) {
            addCriterion("inner_tran_amount =", value, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountNotEqualTo(String value) {
            addCriterion("inner_tran_amount <>", value, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountGreaterThan(String value) {
            addCriterion("inner_tran_amount >", value, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountGreaterThanOrEqualTo(String value) {
            addCriterion("inner_tran_amount >=", value, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountLessThan(String value) {
            addCriterion("inner_tran_amount <", value, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountLessThanOrEqualTo(String value) {
            addCriterion("inner_tran_amount <=", value, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountLike(String value) {
            addCriterion("inner_tran_amount like", value, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountNotLike(String value) {
            addCriterion("inner_tran_amount not like", value, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountIn(List<String> values) {
            addCriterion("inner_tran_amount in", values, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountNotIn(List<String> values) {
            addCriterion("inner_tran_amount not in", values, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountBetween(String value1, String value2) {
            addCriterion("inner_tran_amount between", value1, value2, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerTranAmountNotBetween(String value1, String value2) {
            addCriterion("inner_tran_amount not between", value1, value2, "innerTranAmount");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeIsNull() {
            addCriterion("inner_service_charge is null");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeIsNotNull() {
            addCriterion("inner_service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeEqualTo(String value) {
            addCriterion("inner_service_charge =", value, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeNotEqualTo(String value) {
            addCriterion("inner_service_charge <>", value, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeGreaterThan(String value) {
            addCriterion("inner_service_charge >", value, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeGreaterThanOrEqualTo(String value) {
            addCriterion("inner_service_charge >=", value, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeLessThan(String value) {
            addCriterion("inner_service_charge <", value, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeLessThanOrEqualTo(String value) {
            addCriterion("inner_service_charge <=", value, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeLike(String value) {
            addCriterion("inner_service_charge like", value, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeNotLike(String value) {
            addCriterion("inner_service_charge not like", value, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeIn(List<String> values) {
            addCriterion("inner_service_charge in", values, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeNotIn(List<String> values) {
            addCriterion("inner_service_charge not in", values, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeBetween(String value1, String value2) {
            addCriterion("inner_service_charge between", value1, value2, "innerServiceCharge");
            return (Criteria) this;
        }

        public Criteria andInnerServiceChargeNotBetween(String value1, String value2) {
            addCriterion("inner_service_charge not between", value1, value2, "innerServiceCharge");
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