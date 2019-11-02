package com.insunny.notice.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.insunny.notice.bean.NoticeTemplateBean;
import com.insunny.notice.service.impl.MessageHandleImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * —————Created 2019/11/2 14:05 By Fym.
 */
@RestController
public class MessageNoticeController {


    @Autowired
    private MessageHandleImpl messageHandleImpl;

    @PostMapping("/{noticeTemplateNumber}")
    Map sendMessage(@PathVariable String noticeTemplateNumber, @RequestBody Map body){
        Map<String,Object> result = new HashMap<>(16);

        //判断是否存在该模板
        NoticeTemplateBean ntb = messageHandleImpl.getNoticeTemplateByNumber(noticeTemplateNumber);
        if (ntb == null) {
            //不存在，中断处理直接返回提示信息
            result.put("error","没有该通知模板");
            return result;
        }
        //将数据和模板结合，生成最终将要发送的数据
        System.out.println();
        System.out.println(body.get("message"));
        //生成发送器

        //发送消息并生成日志
        result.put(noticeTemplateNumber,ntb);
        result.put("body",body);
        return result;
    }
}
