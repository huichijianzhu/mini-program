package com.hcjz.pojo;

import java.io.Serializable;

public class HjmallWechatPlatformWithBLOBs extends HjmallWechatPlatform implements Serializable {
    private String certPem;

    private String keyPem;

    public String getCertPem() {
        return certPem;
    }

    public void setCertPem(String certPem) {
        this.certPem = certPem == null ? null : certPem.trim();
    }

    public String getKeyPem() {
        return keyPem;
    }

    public void setKeyPem(String keyPem) {
        this.keyPem = keyPem == null ? null : keyPem.trim();
    }
}