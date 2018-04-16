package cn.itcast.ssm.po;

public class Account {
    private String cardNum;

    private Integer accountId;

    private String cardPassward;

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getCardPassward() {
        return cardPassward;
    }

    public void setCardPassward(String cardPassward) {
        this.cardPassward = cardPassward == null ? null : cardPassward.trim();
    }
}