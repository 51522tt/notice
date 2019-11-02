package com.insunny.notice.service.impl;

import com.insunny.notice.bean.NoticeTemplateBean;
import com.insunny.notice.bean.NoticeTypeBean;
import com.insunny.notice.mapper.MessageNoticeMapper;
import com.insunny.notice.service.MessageHandleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * —————Created 2019/11/2 14:57 By Fym.
 */
@Service
public class MessageHandleImpl implements MessageHandleServer {

    @Autowired
    MessageNoticeMapper messageNoticeMapper;


    @Override
    public NoticeTypeBean getNoticeTypeByNumber(String noticeTypeNumber) {
        return null;
    }

    @Override
    public NoticeTemplateBean getNoticeTemplateByNumber(String noticeTemplateNumber) {
        NoticeTemplateBean noticeTemplate = messageNoticeMapper.getNoticeTemplateByNumber(noticeTemplateNumber);
        return noticeTemplate;
    }
}
