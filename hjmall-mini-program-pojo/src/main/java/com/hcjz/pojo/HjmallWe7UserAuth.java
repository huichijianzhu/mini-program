package com.hcjz.pojo;

import java.io.Serializable;

public class HjmallWe7UserAuth implements Serializable {
    private Integer id;

    private Integer we7UserId;

    private String auth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWe7UserId() {
        return we7UserId;
    }

    public void setWe7UserId(Integer we7UserId) {
        this.we7UserId = we7UserId;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth == null ? null : auth.trim();
    }
}