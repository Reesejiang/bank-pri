package cn.itcast.ssm.po;

public class ThirdPay {
    private String doubleCurr;

    private String outland;

    private String cardNum;

    private String cardPassward;

    public String getDoubleCurr() {
        return doubleCurr;
    }

    public void setDoubleCurr(String doubleCurr) {
        this.doubleCurr = doubleCurr == null ? null : doubleCurr.trim();
    }

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

    public String getCardPassward() {
        return cardPassward;
    }

    public void setCardPassward(String cardPassward) {
        this.cardPassward = cardPassward == null ? null : cardPassward.trim();
    }
}