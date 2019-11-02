package com.insunny.notice.mapper;

import com.insunny.notice.bean.NoticeTemplateBean;
import com.insunny.notice.bean.NoticeTypeBean;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component(value="MessageNoticeMapper")
@Mapper
public interface MessageNoticeMapper {

    @Select("SELECT * FROM tab_notice_type WHERE notice_type_number = #{notice_type_number}")
    NoticeTypeBean getMessageNoticeTypeByNumber(@Param("notice_type_number") String messageNoticeTypeNumber);

    @Select("SELECT * FROM tab_notice_template WHERE notice_template_number = #{noticeTemplateNumber}")
    NoticeTemplateBean getNoticeTemplateByNumber(@Param("noticeTemplateNumber")String noticeTemplateNumber);
}
