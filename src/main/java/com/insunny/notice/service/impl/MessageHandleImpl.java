package com.insunny.notice.service.impl;

import com.insunny.notice.bean.NoticeTemplateBean;
import com.insunny.notice.bean.NoticeTypeBean;
import com.insunny.notice.bean.WechatApplicationBean;
import com.insunny.notice.mapper.MessageNoticeMapper;
import com.insunny.notice.service.MessageHandleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * —————Created 2019/11/2 14:57 By Fym.
 */
@Service
public class MessageHandleImpl implements MessageHandleServer {

    @Autowired
    MessageNoticeMapper messageNoticeMapper;
    @Autowired
    private WechatApplicationImpl wechatApplicationImpl;


    @Override
    public NoticeTypeBean getNoticeTypeByNumber(String noticeTypeNumber) {
        return null;
    }

    @Override
    public NoticeTemplateBean getNoticeTemplateByNumber(String noticeTemplateNumber) {
        NoticeTemplateBean noticeTemplate = messageNoticeMapper.getNoticeTemplateByNumber(noticeTemplateNumber);
        return noticeTemplate;
    }

    @Override
    public String generateData(NoticeTemplateBean ntb, Map noticeBody) {
        //封装发送消息JSON
        String noticeTemplateFormat = ntb.getNoticeTemplateFormat();
        //封装微信信息
        Set bodyKeySet = noticeBody.keySet();
        Iterator iterator = bodyKeySet.iterator();
        while (iterator.hasNext()){
            String next = (String) iterator.next();
            noticeTemplateFormat = noticeTemplateFormat.replace("{{" + next + "}}", (String) (noticeBody.get(next)));
        }
        return noticeTemplateFormat;
    }



}
