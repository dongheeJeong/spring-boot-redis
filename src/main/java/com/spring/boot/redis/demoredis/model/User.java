package com.spring.boot.redis.demoredis.model;

import java.io.Serializable;

public class User implements Serializable {
    private String uid;

    public User(){}
    public User(String uid) {
        this.uid = uid;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
}
