package com.hcjz.service;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.pojo.HjmallWechatPlatform;

/**
 * 微信小程序-基础配置
 */
public interface HjmallWechatPlatformService {

    /**
     * 微信小程序基础配置
     * @param hjmallWechatPlatform
     * @return
     */
    CommonReturnType insertByWechatPlatform(HjmallWechatPlatform hjmallWechatPlatform);

    /**
     *  微信小程序基础配置-根据id查询
     * @param id
     * @return
     */
    CommonReturnType selectById(Integer id);

}
