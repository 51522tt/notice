package com.insunny.notice.mapper;

import com.insunny.notice.bean.WechatApplicationBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component(value="WechatApplicationMapper")
@Mapper
public interface WechatApplicationMapper {

    @Select("SELECT * FROM tab_wechat_app_info WHERE wechat_app_number = #{wechatAppNumber}")
    WechatApplicationBean getWechatapplicationByNumber(@Param("wechatAppNumber") String wechatAppNumber);
}
