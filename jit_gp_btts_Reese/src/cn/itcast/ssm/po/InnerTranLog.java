package cn.itcast.ssm.po;

import java.util.Date;

public class InnerTranLog {
    private String innerBank;

    private Date innerTranTime;

    private Float innerTranNums;

    private String innerTranAmount;

    private String innerServiceCharge;

    private String cardNum;

    public String getInnerBank() {
        return innerBank;
    }

    public void setInnerBank(String innerBank) {
        this.innerBank = innerBank == null ? null : innerBank.trim();
    }

    public Date getInnerTranTime() {
        return innerTranTime;
    }

    public void setInnerTranTime(Date innerTranTime) {
        this.innerTranTime = innerTranTime;
    }

    public Float getInnerTranNums() {
        return innerTranNums;
    }

    public void setInnerTranNums(Float innerTranNums) {
        this.innerTranNums = innerTranNums;
    }

    public String getInnerTranAmount() {
        return innerTranAmount;
    }

    public void setInnerTranAmount(String innerTranAmount) {
        this.innerTranAmount = innerTranAmount == null ? null : innerTranAmount.trim();
    }

    public String getInnerServiceCharge() {
        return innerServiceCharge;
    }

    public void setInnerServiceCharge(String innerServiceCharge) {
        this.innerServiceCharge = innerServiceCharge == null ? null : innerServiceCharge.trim();
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }
}