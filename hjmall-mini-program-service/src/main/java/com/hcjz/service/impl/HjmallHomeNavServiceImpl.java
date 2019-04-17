package com.hcjz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hcjz.common.result.CommonReturnType;
import com.hcjz.mapper.HjmallHomeNavMapper;
import com.hcjz.pojo.HjmallHomeNav;
import com.hcjz.pojo.HjmallHomeNavExample;
import com.hcjz.service.HjmallHomeNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HjmallHomeNavServiceImpl implements HjmallHomeNavService {
    @Autowired
    private HjmallHomeNavMapper hjmallHomeNavMapper;

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
        PageHelper.startPage(pageNum, pageSize);
        //2、执行查询
        HjmallHomeNavExample example = new HjmallHomeNavExample();
        HjmallHomeNavExample.Criteria criteria = example.createCriteria();
        //is_delete=0表示未删除
        criteria.andIsDeleteEqualTo((short) 1);
        List<HjmallHomeNav> hjmallHomeNavs = hjmallHomeNavMapper.selectByExample(example);
        //3、获取分页查询后的数据
        PageInfo<HjmallHomeNav> pageInfo = new PageInfo<>(hjmallHomeNavs);
        //4、封装需要返回的分页实体
        CommonReturnType creat = CommonReturnType.creat(pageInfo.getList(), null);
        return creat;
    }

    @Override
    public CommonReturnType insertByHomeNav(HjmallHomeNav hjmallHomeNav) {
        CommonReturnType creat = CommonReturnType.creat(hjmallHomeNavMapper.insertSelective(hjmallHomeNav), null);
        return creat;
    }

    @Override
    public CommonReturnType updateByHomeNav(HjmallHomeNav hjmallHomeNav) {
        CommonReturnType creat = CommonReturnType.creat(hjmallHomeNavMapper.updateByExampleSelective(hjmallHomeNav, null), null);
        return creat;
    }

    @Override
    public CommonReturnType deleteFakeById(Integer id) {
        CommonReturnType creat = CommonReturnType.creat(hjmallHomeNavMapper.deleteByPrimaryKey(id), null);
        return creat;
    }
}
