package com.insunny.notice.service;

import com.insunny.notice.bean.WechatApplicationBean;
import org.springframework.stereotype.Service;

@Service
public interface WechatApplicationService {

    //获取Wechat信息

    WechatApplicationBean getWechatApplicationByNumber(String wechatApplicationNumber);
}
