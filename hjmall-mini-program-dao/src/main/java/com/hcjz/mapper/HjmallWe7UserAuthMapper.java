package com.hcjz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hcjz.pojo.HjmallWe7UserAuth;
import com.hcjz.pojo.HjmallWe7UserAuthExample;

@Mapper
public interface HjmallWe7UserAuthMapper {
    int countByExample(HjmallWe7UserAuthExample example);

    int deleteByExample(HjmallWe7UserAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HjmallWe7UserAuth record);

    int insertSelective(HjmallWe7UserAuth record);

    List<HjmallWe7UserAuth> selectByExampleWithBLOBs(HjmallWe7UserAuthExample example);

    List<HjmallWe7UserAuth> selectByExample(HjmallWe7UserAuthExample example);

    HjmallWe7UserAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HjmallWe7UserAuth record, @Param("example") HjmallWe7UserAuthExample example);

    int updateByExampleWithBLOBs(@Param("record") HjmallWe7UserAuth record, @Param("example") HjmallWe7UserAuthExample example);

    int updateByExample(@Param("record") HjmallWe7UserAuth record, @Param("example") HjmallWe7UserAuthExample example);

    int updateByPrimaryKeySelective(HjmallWe7UserAuth record);

    int updateByPrimaryKeyWithBLOBs(HjmallWe7UserAuth record);

    int updateByPrimaryKey(HjmallWe7UserAuth record);
}