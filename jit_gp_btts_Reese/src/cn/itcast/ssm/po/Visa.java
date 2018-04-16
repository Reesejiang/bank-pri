package cn.itcast.ssm.po;

public class Visa {
    private Integer visaId;

    private String doubleCurr;

    private String dollor;

    private String rmb;

    public Integer getVisaId() {
        return visaId;
    }

    public void setVisaId(Integer visaId) {
        this.visaId = visaId;
    }

    public String getDoubleCurr() {
        return doubleCurr;
    }

    public void setDoubleCurr(String doubleCurr) {
        this.doubleCurr = doubleCurr == null ? null : doubleCurr.trim();
    }

    public String getDollor() {
        return dollor;
    }

    public void setDollor(String dollor) {
        this.dollor = dollor == null ? null : dollor.trim();
    }

    public String getRmb() {
        return rmb;
    }

    public void setRmb(String rmb) {
        this.rmb = rmb == null ? null : rmb.trim();
    }
}