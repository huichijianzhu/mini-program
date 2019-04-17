package com.hcjz.service.impl;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.mapper.HjmallUserMapper;
import com.hcjz.service.HjmallUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HjmallUserServiceImpl implements HjmallUserService {
    @Autowired
    private HjmallUserMapper hjmallUserMapper;

    @Override
    public CommonReturnType selectByUnionIdOrNickname(String unionIdOrNickname) {
        return null;
    }
}
