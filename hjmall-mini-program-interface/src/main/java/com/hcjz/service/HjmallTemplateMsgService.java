package com.hcjz.service;

import com.hcjz.common.result.CommonReturnType;
import com.hcjz.pojo.HjmallTemplateMsg;

/**
 * 群发模板消息-新增模板
 */
public interface HjmallTemplateMsgService {

    /**
     * 新增模板
     * @param hjmallTemplateMsg
     * @return
     */
    CommonReturnType insertByHjmallTemplateMsg(HjmallTemplateMsg hjmallTemplateMsg);
}
