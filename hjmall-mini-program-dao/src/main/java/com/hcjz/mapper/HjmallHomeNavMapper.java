package com.hcjz.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hcjz.pojo.HjmallHomeNav;
import com.hcjz.pojo.HjmallHomeNavExample;

import java.util.List;

@Mapper
public interface HjmallHomeNavMapper {
    int countByExample(HjmallHomeNavExample example);

    int deleteByExample(HjmallHomeNavExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HjmallHomeNav record);

    int insertSelective(HjmallHomeNav record);

    List<HjmallHomeNav> selectByExampleWithBLOBs(HjmallHomeNavExample example);

    List<HjmallHomeNav> selectByExample(HjmallHomeNavExample example);

    HjmallHomeNav selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HjmallHomeNav record, @Param("example") HjmallHomeNavExample example);

    int updateByExampleWithBLOBs(@Param("record") HjmallHomeNav record, @Param("example") HjmallHomeNavExample example);

    int updateByExample(@Param("record") HjmallHomeNav record, @Param("example") HjmallHomeNavExample example);

    int updateByPrimaryKeySelective(HjmallHomeNav record);

    int updateByPrimaryKeyWithBLOBs(HjmallHomeNav record);

    int updateByPrimaryKey(HjmallHomeNav record);
}