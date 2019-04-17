package com.hcjz.service.impl;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.mapper.HjmallTemplateMsgMapper;
import com.hcjz.pojo.HjmallTemplateMsg;
import com.hcjz.service.HjmallTemplateMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HjmallTemplateMsgServiceImpl implements HjmallTemplateMsgService {
    @Autowired
    private HjmallTemplateMsgMapper hjmallTemplateMsgMapper;

    @Override
    public CommonReturnType insertByHjmallTemplateMsg(HjmallTemplateMsg hjmallTemplateMsg) {
        return null;
    }
}
