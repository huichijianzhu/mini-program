package com.hcjz.service.impl;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.mapper.HjmallBannerMapper;
import com.hcjz.pojo.HjmallBanner;
import com.hcjz.service.HjmallBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HjmallBannerServiceImpl implements HjmallBannerService {
    @Autowired
    private HjmallBannerMapper hjmallBannerMapper;

    @Override
    public CommonReturnType selectList() {
        List<HjmallBanner> hjmallBanners = hjmallBannerMapper.selectByExample(null);
        return CommonReturnType.creat(hjmallBanners);
    }

    @Override
    public CommonReturnType updateByBanner(HjmallBanner hjmallBanner) {
        int i = hjmallBannerMapper.updateByExample(hjmallBanner, null);
        if (i == 0) {
            return CommonReturnType.creat(null, "false");
        }
        return CommonReturnType.creat(null,"success");
    }

    @Override
    public CommonReturnType insertByBanner(HjmallBanner hjmallBanner) {

        return null;
    }

    @Override
    public CommonReturnType deleteFakeById(Integer id) {
        return null;
    }
}
