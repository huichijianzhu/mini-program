package com.hcjz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hcjz.common.result.CommonReturnType;
import com.hcjz.mapper.HjmallHomeBlockMapper;
import com.hcjz.pojo.HjmallHomeBlock;
import com.hcjz.pojo.HjmallHomeBlockExample;
import com.hcjz.service.HjmallHomeBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HjmallHomeBlockServiceImpl implements HjmallHomeBlockService {
    @Autowired
    private HjmallHomeBlockMapper hjmallHomeBlockMapper;

    @Override
    public CommonReturnType selectList(Integer pageNum, Integer pageSize) {
        //为了程序的严谨性，判断非空：
        if(pageNum == null){
            pageNum = 1;   //设置默认当前页
        }
        if(pageNum <= 0){
            pageNum = 1;
         }
        if(pageSize == null){
            pageSize = 5;    //设置默认每页显示的商品数
        }
        //1、设置分页信息，包括当前页数和每页显示的总计数
        PageHelper.startPage(pageNum, pageSize ,true);
        //2、执行查询
        HjmallHomeBlockExample example = new HjmallHomeBlockExample();
        HjmallHomeBlockExample.Criteria criteria = example.createCriteria();
        //is_delete=0表示未删除
        criteria.andIsDeleteEqualTo((short) 0);
        List<HjmallHomeBlock> hjmallHomeBlocks = hjmallHomeBlockMapper.selectByExample(example);
        //3、获取分页查询后的数据
        PageInfo<HjmallHomeBlock> pageInfo = new PageInfo<>(hjmallHomeBlocks);
        //4、封装需要返回的分页实体
        CommonReturnType creat = CommonReturnType.creat(pageInfo.getList(), null);
        return creat;
    }

    @Override
    public CommonReturnType insertByHomeBlock(HjmallHomeBlock hjmallHomeBlock) {
        CommonReturnType creat = CommonReturnType.creat(hjmallHomeBlockMapper.insertSelective(hjmallHomeBlock), null);
        return creat;
    }

    @Override
    public CommonReturnType updateByHomeBlock(HjmallHomeBlock hjmallHomeBlock) {
        CommonReturnType creat = CommonReturnType.creat(hjmallHomeBlockMapper.updateByExampleSelective(hjmallHomeBlock, null), null);
        return creat;
    }

    @Override
    public CommonReturnType deleteFakeById(Integer id) {
        CommonReturnType creat = CommonReturnType.creat(hjmallHomeBlockMapper.deleteByPrimaryKey(id), null);
        return creat;
    }
}
