package com.hcjz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hcjz.pojo.HjmallTemplateMsg;
import com.hcjz.pojo.HjmallTemplateMsgExample;

@Mapper
public interface HjmallTemplateMsgMapper {
    int countByExample(HjmallTemplateMsgExample example);

    int deleteByExample(HjmallTemplateMsgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HjmallTemplateMsg record);

    int insertSelective(HjmallTemplateMsg record);

    List<HjmallTemplateMsg> selectByExample(HjmallTemplateMsgExample example);

    HjmallTemplateMsg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HjmallTemplateMsg record, @Param("example") HjmallTemplateMsgExample example);

    int updateByExample(@Param("record") HjmallTemplateMsg record, @Param("example") HjmallTemplateMsgExample example);

    int updateByPrimaryKeySelective(HjmallTemplateMsg record);

    int updateByPrimaryKey(HjmallTemplateMsg record);
}