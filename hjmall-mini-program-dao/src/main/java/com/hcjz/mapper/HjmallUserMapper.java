package com.hcjz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hcjz.pojo.HjmallUser;
import com.hcjz.pojo.HjmallUserExample;

@Mapper
public interface HjmallUserMapper {
    int countByExample(HjmallUserExample example);

    int deleteByExample(HjmallUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HjmallUser record);

    int insertSelective(HjmallUser record);

    List<HjmallUser> selectByExampleWithBLOBs(HjmallUserExample example);

    List<HjmallUser> selectByExample(HjmallUserExample example);

    HjmallUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HjmallUser record, @Param("example") HjmallUserExample example);

    int updateByExampleWithBLOBs(@Param("record") HjmallUser record, @Param("example") HjmallUserExample example);

    int updateByExample(@Param("record") HjmallUser record, @Param("example") HjmallUserExample example);

    int updateByPrimaryKeySelective(HjmallUser record);

    int updateByPrimaryKeyWithBLOBs(HjmallUser record);

    int updateByPrimaryKey(HjmallUser record);
}