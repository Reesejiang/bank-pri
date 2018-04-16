package cn.itcast.ssm.po;

import java.util.Date;

public class OutterTranLog {
    private String outterBank;

    private Date outterTranTime;

    private Float outterTranNums;

    private String outterTranAmount;

    private String outterServiceCharge;

    private String cardNum;

    public String getOutterBank() {
        return outterBank;
    }

    public void setOutterBank(String outterBank) {
        this.outterBank = outterBank == null ? null : outterBank.trim();
    }

    public Date getOutterTranTime() {
        return outterTranTime;
    }

    public void setOutterTranTime(Date outterTranTime) {
        this.outterTranTime = outterTranTime;
    }

    public Float getOutterTranNums() {
        return outterTranNums;
    }

    public void setOutterTranNums(Float outterTranNums) {
        this.outterTranNums = outterTranNums;
    }

    public String getOutterTranAmount() {
        return outterTranAmount;
    }

    public void setOutterTranAmount(String outterTranAmount) {
        this.outterTranAmount = outterTranAmount == null ? null : outterTranAmount.trim();
    }

    public String getOutterServiceCharge() {
        return outterServiceCharge;
    }

    public void setOutterServiceCharge(String outterServiceCharge) {
        this.outterServiceCharge = outterServiceCharge == null ? null : outterServiceCharge.trim();
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }
}