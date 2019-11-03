package com.insunny.notice.service.impl;

import com.insunny.notice.bean.WechatApplicationBean;
import com.insunny.notice.mapper.WechatApplicationMapper;
import com.insunny.notice.service.WechatApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WechatApplicationImpl implements WechatApplicationService {


    @Autowired
    private WechatApplicationMapper WechatApplicationMpper;

    @Override
    public WechatApplicationBean getWechatApplicationByNumber(String number) {
        WechatApplicationBean wechatapplication = WechatApplicationMpper.getWechatapplicationByNumber(number);

        return wechatapplication;
    }
}
