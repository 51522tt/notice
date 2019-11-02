package com.insunny.notice.service;

import com.insunny.notice.bean.NoticeTemplateBean;
import com.insunny.notice.bean.NoticeTypeBean;

public interface MessageHandleServer {

    //是否存在该类型
    NoticeTypeBean getNoticeTypeByNumber(String noticeTypeNumber);

    //查找指定通知模板
    NoticeTemplateBean getNoticeTemplateByNumber(String noticeTemplateNumber);
}
