package com.insunny.notice.bean;

public class WechatApplicationBean {

    private Integer id;

    private String wechatAppNumber;
    private String wechatAppAgentid;
    private String wechatAppSecret;
    private String wechatAppName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWechatAppNumber() {
        return wechatAppNumber;
    }

    public void setWechatAppNumber(String wechatAppNumber) {
        this.wechatAppNumber = wechatAppNumber;
    }

    public String getWechatAppAgentid() {
        return wechatAppAgentid;
    }

    public void setWechatAppAgentid(String wechatAppAgentid) {
        this.wechatAppAgentid = wechatAppAgentid;
    }

    public String getWechatAppSecret() {
        return wechatAppSecret;
    }

    public void setWechatAppSecret(String wechatAppSecret) {
        this.wechatAppSecret = wechatAppSecret;
    }

    public String getWechatAppName() {
        return wechatAppName;
    }

    public void setWechatAppName(String wechatAppName) {
        this.wechatAppName = wechatAppName;
    }

    @Override
    public String toString() {
        return "WechatApplicationBean{" +
                "id=" + id +
                ", wechatAppNumber='" + wechatAppNumber + '\'' +
                ", wechatAppAgentid='" + wechatAppAgentid + '\'' +
                ", wechatAppSecret='" + wechatAppSecret + '\'' +
                ", wechatAppName='" + wechatAppName + '\'' +
                '}';
    }
}
