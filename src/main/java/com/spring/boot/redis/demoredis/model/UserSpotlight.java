package com.spring.boot.redis.demoredis.model;

import java.io.Serializable;

public class UserSpotlight implements Serializable {

    private static final long serialVersionUID = 1L;
    private String uid;
    private Long spotlightId;

    public UserSpotlight(){}
    public UserSpotlight(String uid, Long spotlightId) {
        this.uid = uid;
        this.spotlightId = spotlightId;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getSpotlightId() {
        return spotlightId;
    }

    public void setSpotlightId(Long spotlightId) {
        this.spotlightId = spotlightId;
    }

    @Override
    public String toString() {
        return String.format("Member{uid='%s', spotlightId='%s'}", uid, spotlightId);
    }
}
