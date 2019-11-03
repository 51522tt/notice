package com.insunny.notice.controller;

import com.insunny.notice.bean.NoticeTemplateBean;
import com.insunny.notice.bean.WechatApplicationBean;
import com.insunny.notice.service.impl.MessageHandleImpl;
import com.insunny.notice.service.impl.WechatApplicationImpl;
import netscape.javascript.JSObject;
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
    @Autowired
    private WechatApplicationImpl wechatApplicationImpl;

    @PostMapping("/{noticeTemplateNumber}")
    Map sendMessage(@PathVariable String noticeTemplateNumber, @RequestBody Map noticeBody){
        Map<String,Object> result = new HashMap<>(16);

        //判断是否存在该模板
        NoticeTemplateBean ntb = messageHandleImpl.getNoticeTemplateByNumber(noticeTemplateNumber);
        if (ntb == null) {
            //不存在，中断处理直接返回提示信息
            result.put("error","没有该通知模板");
            return result;
        }

        //封装微信信用独用信息，后期扩展时，需要单独封装，目前时间仓促且只有微信通知暂不封装，此处是个技术债
        WechatApplicationBean wechatApp = wechatApplicationImpl.getWechatApplicationByNumber(ntb.getGeneralApplicationNumber());
        noticeBody.put("agentid",wechatApp.getWechatAppAgentid());

        //将数据和模板结合，生成最终将要发送的数据
        String noticeJsonStr = messageHandleImpl.generateData(
                ntb,
                noticeBody
        );
        //生成发送器
        // senderGenerateHandler(通知类型,发送体).send()


        //发送消息并生成日志
        result.put(noticeTemplateNumber,ntb);
        result.put("noticeBody",noticeBody);
        result.put("noticeJsonStr",noticeJsonStr);
        return result;
    }
}
