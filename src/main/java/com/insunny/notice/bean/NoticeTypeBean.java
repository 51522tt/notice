package com.insunny.notice.bean;

/**
 * —————Created 2019/11/2 14:53 By Fym.
 */

public class NoticeTypeBean {

    private Integer id;

    private String messageNoticeTypeNumber;
    private String messageNoticeTypeName;
    private String messageNoticeTypeProfile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageNoticeTypeNumber() {
        return messageNoticeTypeNumber;
    }

    public void setMessageNoticeTypeNumber(String messageNoticeTypeNumber) {
        this.messageNoticeTypeNumber = messageNoticeTypeNumber;
    }

    public String getMessageNoticeTypeName() {
        return messageNoticeTypeName;
    }

    public void setMessageNoticeTypeName(String messageNoticeTypeName) {
        this.messageNoticeTypeName = messageNoticeTypeName;
    }

    public String getMessageNoticeTypeProfile() {
        return messageNoticeTypeProfile;
    }

    public void setMessageNoticeTypeProfile(String messageNoticeTypeProfile) {
        this.messageNoticeTypeProfile = messageNoticeTypeProfile;
    }

    @Override
    public String toString() {
        return "NoticeTypeBean{" +
                "id=" + id +
                ", messageNoticeTypeNumber='" + messageNoticeTypeNumber + '\'' +
                ", messageNoticeTypeName='" + messageNoticeTypeName + '\'' +
                ", messageNoticeTypeProfile='" + messageNoticeTypeProfile + '\'' +
                '}';
    }
}
