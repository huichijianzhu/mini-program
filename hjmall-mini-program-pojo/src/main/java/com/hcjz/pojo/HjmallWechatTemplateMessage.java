package com.hcjz.pojo;

import java.io.Serializable;

public class HjmallWechatTemplateMessage implements Serializable {
    private Integer id;

    private Integer storeId;

    private String payTpl;

    private String sendTpl;

    private String refundTpl;

    private String notPayTpl;

    private String revokeTpl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getPayTpl() {
        return payTpl;
    }

    public void setPayTpl(String payTpl) {
        this.payTpl = payTpl == null ? null : payTpl.trim();
    }

    public String getSendTpl() {
        return sendTpl;
    }

    public void setSendTpl(String sendTpl) {
        this.sendTpl = sendTpl == null ? null : sendTpl.trim();
    }

    public String getRefundTpl() {
        return refundTpl;
    }

    public void setRefundTpl(String refundTpl) {
        this.refundTpl = refundTpl == null ? null : refundTpl.trim();
    }

    public String getNotPayTpl() {
        return notPayTpl;
    }

    public void setNotPayTpl(String notPayTpl) {
        this.notPayTpl = notPayTpl == null ? null : notPayTpl.trim();
    }

    public String getRevokeTpl() {
        return revokeTpl;
    }

    public void setRevokeTpl(String revokeTpl) {
        this.revokeTpl = revokeTpl == null ? null : revokeTpl.trim();
    }
}