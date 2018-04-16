package cn.itcast.ssm.po;

public class TransfereeInfo {
    private Integer transfereeId;

    private String cardNum;

    private String userName;

    private String innerBank;

    private String outterBank;

    public Integer getTransfereeId() {
        return transfereeId;
    }

    public void setTransfereeId(Integer transfereeId) {
        this.transfereeId = transfereeId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getInnerBank() {
        return innerBank;
    }

    public void setInnerBank(String innerBank) {
        this.innerBank = innerBank == null ? null : innerBank.trim();
    }

    public String getOutterBank() {
        return outterBank;
    }

    public void setOutterBank(String outterBank) {
        this.outterBank = outterBank == null ? null : outterBank.trim();
    }
}