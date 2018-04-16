package cn.itcast.ssm.po;

public class UserConsume {
    private Integer userConsumeId;

    private Float consumeSum;

    private Float consumeDis;

    private Float consumePoints;

    private String userName;

    public Integer getUserConsumeId() {
        return userConsumeId;
    }

    public void setUserConsumeId(Integer userConsumeId) {
        this.userConsumeId = userConsumeId;
    }

    public Float getConsumeSum() {
        return consumeSum;
    }

    public void setConsumeSum(Float consumeSum) {
        this.consumeSum = consumeSum;
    }

    public Float getConsumeDis() {
        return consumeDis;
    }

    public void setConsumeDis(Float consumeDis) {
        this.consumeDis = consumeDis;
    }

    public Float getConsumePoints() {
        return consumePoints;
    }

    public void setConsumePoints(Float consumePoints) {
        this.consumePoints = consumePoints;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}