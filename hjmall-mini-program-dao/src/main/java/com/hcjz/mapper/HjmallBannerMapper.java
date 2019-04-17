package com.hcjz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hcjz.pojo.HjmallBanner;
import com.hcjz.pojo.HjmallBannerExample;
import com.hcjz.pojo.HjmallBannerWithBLOBs;

@Mapper
public interface HjmallBannerMapper {
    int countByExample(HjmallBannerExample example);

    int deleteByExample(HjmallBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HjmallBannerWithBLOBs record);

    int insertSelective(HjmallBannerWithBLOBs record);

    List<HjmallBannerWithBLOBs> selectByExampleWithBLOBs(HjmallBannerExample example);

    List<HjmallBanner> selectByExample(HjmallBannerExample example);

    HjmallBannerWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HjmallBannerWithBLOBs record, @Param("example") HjmallBannerExample example);

    int updateByExampleWithBLOBs(@Param("record") HjmallBannerWithBLOBs record, @Param("example") HjmallBannerExample example);

    int updateByExample(@Param("record") HjmallBanner record, @Param("example") HjmallBannerExample example);

    int updateByPrimaryKeySelective(HjmallBannerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HjmallBannerWithBLOBs record);

    int updateByPrimaryKey(HjmallBanner record);
}