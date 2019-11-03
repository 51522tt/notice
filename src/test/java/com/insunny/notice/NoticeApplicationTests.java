package com.insunny.notice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.insunny.notice.bean.NoticeTemplateBean;
import com.insunny.notice.bean.WechatApplicationBean;
import com.insunny.notice.mapper.MessageNoticeMapper;
import com.insunny.notice.mapper.WechatApplicationMapper;
import com.insunny.notice.service.impl.MessageHandleImpl;
import com.insunny.notice.service.impl.WechatApplicationImpl;
import com.insunny.notice.utils.HttpUtils;
import netscape.javascript.JSObject;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class NoticeApplicationTests {


    @Autowired
    private MessageHandleImpl messageHandleImpl;
    @Autowired
    private WechatApplicationImpl wechatApplicationImpl;
    @Autowired
    private WechatApplicationMapper WechatApplicationMapper;
    @Autowired
    private com.insunny.notice.mapper.MessageNoticeMapper MessageNoticeMapper;



    @Test
    void contextLoads() throws IOException {

        String url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ww627325e91990e7e7&corpsecret=p0oHHclTBMIDXE1YCrKJXGp4AVHqIoTnuqesE2ktLJg";
        String send_url = "https://qyapi.weixin.qq.com/cgi-bin/linkedcorp/message/send?access_token=chW3Pppyrlh0HoxkK_EwNJpq9SFZdUMD4r5kTffPXrKTTRlOsYEbVg_4NUaQaTklHlTmU6u3HToASR9gNVZplyVyVBG7dQY7x6QKFs3m92uOIyB_LCOqNPiHWcwOgqGetejZ92W2_3yCz5KunxRMttXoxX7hfeBpTvwjIwcYUHmpFXLv0NPwP2s2DBzpa_Na7IhChVIp6vtyBb1Rj2I3UQ";


        Map body = new HashMap();
        Map mark = new HashMap();
        body.put("touser","ChenJiYe");
        body.put("msgtype","markdown");
        body.put("agentid","1000007");
        body.put("markdown",mark.put("content","haha"));
        String s = JSON.toJSONString(body);
        CloseableHttpResponse post = HttpUtils.post(send_url,s, "application/json");
        System.out.println(EntityUtils.toString(post.getEntity(),"utf-8"));

    }




}
