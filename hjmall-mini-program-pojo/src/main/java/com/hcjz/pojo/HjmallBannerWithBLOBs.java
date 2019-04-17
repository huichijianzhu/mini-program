package com.hcjz.pojo;

import java.io.Serializable;

public class HjmallBannerWithBLOBs extends HjmallBanner implements Serializable {
    private String picUrl;

    private String pageUrl;

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl == null ? null : pageUrl.trim();
    }
}