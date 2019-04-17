package com.hcjz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hcjz.pojo.HjmallWechatTemplateMessage;
import com.hcjz.pojo.HjmallWechatTemplateMessageExample;

@Mapper
public interface HjmallWechatTemplateMessageMapper {
    int countByExample(HjmallWechatTemplateMessageExample example);

    int deleteByExample(HjmallWechatTemplateMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HjmallWechatTemplateMessage record);

    int insertSelective(HjmallWechatTemplateMessage record);

    List<HjmallWechatTemplateMessage> selectByExample(HjmallWechatTemplateMessageExample example);

    HjmallWechatTemplateMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HjmallWechatTemplateMessage record, @Param("example") HjmallWechatTemplateMessageExample example);

    int updateByExample(@Param("record") HjmallWechatTemplateMessage record, @Param("example") HjmallWechatTemplateMessageExample example);

    int updateByPrimaryKeySelective(HjmallWechatTemplateMessage record);

    int updateByPrimaryKey(HjmallWechatTemplateMessage record);
}