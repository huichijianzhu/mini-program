package com.hcjz.service;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.pojo.HjmallBanner;

/**
 * 轮播图
 */
public interface HjmallBannerService {

    /**
     * 商城首页轮播图
     * @return
     */
    CommonReturnType selectList();

    /**
     * 商城首页轮播图-修改
     * @param hjmallBanner
     * @return
     */
    CommonReturnType updateByBanner(HjmallBanner hjmallBanner);

    /**
     * 商城首页轮播图-新增
     * @param hjmallBanner
     * @return
     */
    CommonReturnType insertByBanner(HjmallBanner hjmallBanner);

    /**
     * 商城首页轮播图-删除(假删)
     * @param id
     * @return
     */
    CommonReturnType deleteFakeById(Integer id);
}
