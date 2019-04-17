package com.hcjz.service.impl;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.mapper.HjmallWechatPlatformMapper;
import com.hcjz.pojo.HjmallWechatPlatform;
import com.hcjz.service.HjmallWechatPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HjmallWechatPlatformServiceImpl implements HjmallWechatPlatformService {
    @Autowired
    private HjmallWechatPlatformMapper hjmallWechatPlatformMapper;

    @Override
    public CommonReturnType insertByWechatPlatform(HjmallWechatPlatform hjmallWechatPlatform) {
        return null;
    }

    @Override
    public CommonReturnType selectById(Integer id) {
        return null;
    }
}
