package cn.itcast.ssm.po;

public class AccountDetail {
    private String outland;

    private String cardNum;

    public String getOutland() {
        return outland;
    }

    public void setOutland(String outland) {
        this.outland = outland == null ? null : outland.trim();
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }
}