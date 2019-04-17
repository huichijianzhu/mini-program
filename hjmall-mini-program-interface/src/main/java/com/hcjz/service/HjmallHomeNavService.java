package com.hcjz.service;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.pojo.HjmallHomeNav;

/**
 * 导航图标-首页导航图标
 */
public interface HjmallHomeNavService {

    /**
     * 首页导航图标-分页列表(isDelete=1)
     * @param pageNum   页码
     * @param pageSize  页长
     * @return
     */
    CommonReturnType selectList(Integer pageNum, Integer pageSize);

    /**
     * 首页导航图标-新增
     *
     * @param hjmallActionLog
     */
    CommonReturnType insertByHomeNav(HjmallHomeNav hjmallActionLog);

    /**
     * 首页导航图标-修改
     *
     * @param hjmallActionLog
     */
    CommonReturnType updateByHomeNav(HjmallHomeNav hjmallActionLog);

    /**
     * 首页导航图标-删除(假删)
     *
     * @param id
     */
    CommonReturnType deleteFakeById(Integer id);


}
