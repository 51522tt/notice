package com.insunny.notice.bean;

import java.util.Date;

/**
 * —————Created 2019/11/2 17:19 By Fym.
 */
public class LogNoticeSendingRecordBean {

    private Integer id;
    private String logSuorceData;
    private String noticeTemplate_number;
    private String logSendData;
    private String logSendr;
    private String logSendIP;
    private String logReceiver;
    private String logReceiveDepartment;
    private String logCC;
    private Date logSendDatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogSuorceData() {
        return logSuorceData;
    }

    public void setLogSuorceData(String logSuorceData) {
        this.logSuorceData = logSuorceData;
    }

    public String getNoticeTemplate_number() {
        return noticeTemplate_number;
    }

    public void setNoticeTemplate_number(String noticeTemplate_number) {
        this.noticeTemplate_number = noticeTemplate_number;
    }

    public String getLogSendData() {
        return logSendData;
    }

    public void setLogSendData(String logSendData) {
        this.logSendData = logSendData;
    }

    public String getLogSendr() {
        return logSendr;
    }

    public void setLogSendr(String logSendr) {
        this.logSendr = logSendr;
    }

    public String getLogSendIP() {
        return logSendIP;
    }

    public void setLogSendIP(String logSendIP) {
        this.logSendIP = logSendIP;
    }

    public String getLogReceiver() {
        return logReceiver;
    }

    public void setLogReceiver(String logReceiver) {
        this.logReceiver = logReceiver;
    }

    public String getLogReceiveDepartment() {
        return logReceiveDepartment;
    }

    public void setLogReceiveDepartment(String logReceiveDepartment) {
        this.logReceiveDepartment = logReceiveDepartment;
    }

    public String getLogCC() {
        return logCC;
    }

    public void setLogCC(String logCC) {
        this.logCC = logCC;
    }

    public Date getLogSendDatetime() {
        return logSendDatetime;
    }

    public void setLogSendDatetime(Date logSendDatetime) {
        this.logSendDatetime = logSendDatetime;
    }

    @Override
    public String toString() {
        return "LogNoticeSendingRecordBean{" +
                "id=" + id +
                ", logSuorceData='" + logSuorceData + '\'' +
                ", noticeTemplate_number='" + noticeTemplate_number + '\'' +
                ", logSendData='" + logSendData + '\'' +
                ", logSendr='" + logSendr + '\'' +
                ", logSendIP='" + logSendIP + '\'' +
                ", logReceiver='" + logReceiver + '\'' +
                ", logReceiveDepartment='" + logReceiveDepartment + '\'' +
                ", logCC='" + logCC + '\'' +
                ", logSendDatetime=" + logSendDatetime +
                '}';
    }
}