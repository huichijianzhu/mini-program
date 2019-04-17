package com.hcjz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hcjz.pojo.HjmallWechatApp;
import com.hcjz.pojo.HjmallWechatAppExample;
import com.hcjz.pojo.HjmallWechatAppWithBLOBs;

@Mapper
public interface HjmallWechatAppMapper {
    int countByExample(HjmallWechatAppExample example);

    int deleteByExample(HjmallWechatAppExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HjmallWechatAppWithBLOBs record);

    int insertSelective(HjmallWechatAppWithBLOBs record);

    List<HjmallWechatAppWithBLOBs> selectByExampleWithBLOBs(HjmallWechatAppExample example);

    List<HjmallWechatApp> selectByExample(HjmallWechatAppExample example);

    HjmallWechatAppWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HjmallWechatAppWithBLOBs record, @Param("example") HjmallWechatAppExample example);

    int updateByExampleWithBLOBs(@Param("record") HjmallWechatAppWithBLOBs record, @Param("example") HjmallWechatAppExample example);

    int updateByExample(@Param("record") HjmallWechatApp record, @Param("example") HjmallWechatAppExample example);

    int updateByPrimaryKeySelective(HjmallWechatAppWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HjmallWechatAppWithBLOBs record);

    int updateByPrimaryKey(HjmallWechatApp record);
}