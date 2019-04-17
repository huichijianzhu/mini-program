package com.hcjz.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hcjz.pojo.HjmallHomeBlock;
import com.hcjz.pojo.HjmallHomeBlockExample;

import java.util.List;

@Mapper
public interface HjmallHomeBlockMapper {
    int countByExample(HjmallHomeBlockExample example);

    int deleteByExample(HjmallHomeBlockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HjmallHomeBlock record);

    int insertSelective(HjmallHomeBlock record);

    List<HjmallHomeBlock> selectByExampleWithBLOBs(HjmallHomeBlockExample example);

    List<HjmallHomeBlock> selectByExample(HjmallHomeBlockExample example);

    HjmallHomeBlock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HjmallHomeBlock record, @Param("example") HjmallHomeBlockExample example);

    int updateByExampleWithBLOBs(@Param("record") HjmallHomeBlock record, @Param("example") HjmallHomeBlockExample example);

    int updateByExample(@Param("record") HjmallHomeBlock record, @Param("example") HjmallHomeBlockExample example);

    int updateByPrimaryKeySelective(HjmallHomeBlock record);

    int updateByPrimaryKeyWithBLOBs(HjmallHomeBlock record);

    int updateByPrimaryKey(HjmallHomeBlock record);
}