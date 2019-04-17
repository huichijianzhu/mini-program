package com.hcjz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hcjz.pojo.HjmallWechatPlatform;
import com.hcjz.pojo.HjmallWechatPlatformExample;
import com.hcjz.pojo.HjmallWechatPlatformWithBLOBs;

@Mapper
public interface HjmallWechatPlatformMapper {
    int countByExample(HjmallWechatPlatformExample example);

    int deleteByExample(HjmallWechatPlatformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HjmallWechatPlatformWithBLOBs record);

    int insertSelective(HjmallWechatPlatformWithBLOBs record);

    List<HjmallWechatPlatformWithBLOBs> selectByExampleWithBLOBs(HjmallWechatPlatformExample example);

    List<HjmallWechatPlatform> selectByExample(HjmallWechatPlatformExample example);

    HjmallWechatPlatformWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HjmallWechatPlatformWithBLOBs record, @Param("example") HjmallWechatPlatformExample example);

    int updateByExampleWithBLOBs(@Param("record") HjmallWechatPlatformWithBLOBs record, @Param("example") HjmallWechatPlatformExample example);

    int updateByExample(@Param("record") HjmallWechatPlatform record, @Param("example") HjmallWechatPlatformExample example);

    int updateByPrimaryKeySelective(HjmallWechatPlatformWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HjmallWechatPlatformWithBLOBs record);

    int updateByPrimaryKey(HjmallWechatPlatform record);
}