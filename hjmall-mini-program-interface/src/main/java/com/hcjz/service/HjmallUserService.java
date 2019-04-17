package com.hcjz.service;

import com.hcjz.common.result.CommonReturnType;

/**
 * 微信小程序-群发模板消息-发送对象
 */
public interface HjmallUserService {

    /**
     * 通过unionId或者昵称查找用户
     * @param unionIdOrNickname 用户的unionId或者昵称
     * @return
     */
    CommonReturnType selectByUnionIdOrNickname(String unionIdOrNickname);

}
