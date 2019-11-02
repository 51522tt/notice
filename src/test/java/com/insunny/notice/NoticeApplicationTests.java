package com.insunny.notice;

import com.insunny.notice.bean.NoticeTypeBean;
import com.insunny.notice.service.impl.MessageHandleImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NoticeApplicationTests {


    @Autowired
    private MessageHandleImpl messageHandleImpl;

    @Test
    void contextLoads() {
        //NoticeTypeBean wechat = messageHandleImpl.getMessageNoticeTypeByNumber("wechat");
        //System.out.println(wechat);
    }



}
