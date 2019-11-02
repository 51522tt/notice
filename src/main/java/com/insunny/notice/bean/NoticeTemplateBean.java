package com.insunny.notice.bean;

/**
 * —————Created 2019/11/2 16:40 By Fym.
 */
public class NoticeTemplateBean {

    private Integer id;
    private String noticeTemplateNumber;
    private String noticeTemplateFormat;
    private String noticeTypeNumber;
    private String generalApplicationNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoticeTemplateNumber() {
        return noticeTemplateNumber;
    }

    public void setNoticeTemplateNumber(String noticeTemplateNumber) {
        this.noticeTemplateNumber = noticeTemplateNumber;
    }

    public String getNoticeTemplateFormat() {
        return noticeTemplateFormat;
    }

    public void setNoticeTemplateFormat(String noticeTemplateFormat) {
        this.noticeTemplateFormat = noticeTemplateFormat;
    }

    public String getNoticeTypeNumber() {
        return noticeTypeNumber;
    }

    public void setNoticeTypeNumber(String noticeTypeNumber) {
        this.noticeTypeNumber = noticeTypeNumber;
    }

    public String getGeneralApplicationNumber() {
        return generalApplicationNumber;
    }

    public void setGeneralApplicationNumber(String generalApplicationNumber) {
        this.generalApplicationNumber = generalApplicationNumber;
    }

    @Override
    public String toString() {
        return "NoticeTemplateBean{" +
                "id=" + id +
                ", noticeTemplateNumber='" + noticeTemplateNumber + '\'' +
                ", noticeTemplateFormat='" + noticeTemplateFormat + '\'' +
                ", noticeTypeNumber='" + noticeTypeNumber + '\'' +
                ", generalApplicationNumber='" + generalApplicationNumber + '\'' +
                '}';
    }
}
