package com.hcjz.service;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.pojo.HjmallHomeBlock;

/**
 * 微信小程序-群发模板消息
 */
public interface HjmallHomeBlockService {

    /**
     * 查询列表
     *
     * @return
     */
    CommonReturnType selectList(Integer pageNum, Integer pageSize);

    /**
     * 新增模板
     *
     * @param hjmallActionLog
     */
    CommonReturnType insertByHomeBlock(HjmallHomeBlock hjmallActionLog);

    /**
     * 修改
     *
     * @param hjmallActionLog
     */
    CommonReturnType updateByHomeBlock(HjmallHomeBlock hjmallActionLog);

    /**
     * 删除(假删)
     *
     * @param id
     */
    CommonReturnType deleteFakeById(Integer id);


}
