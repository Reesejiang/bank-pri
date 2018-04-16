package cn.itcast.ssm.po;

public class UserList {
    private String userName;

    private String password;

    private String name;

    private Integer userVolume;

    private String cardNum;

    private String cardPassward;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getUserVolume() {
        return userVolume;
    }

    public void setUserVolume(Integer userVolume) {
        this.userVolume = userVolume;
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