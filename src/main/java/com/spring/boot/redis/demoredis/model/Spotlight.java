package com.spring.boot.redis.demoredis.model;

import java.io.Serializable;

public class Spotlight implements Serializable {
    private Long spotlightId;

    public Spotlight(){}
    public Spotlight(Long spotlightId) {
        this.spotlightId = spotlightId;
    }

    public Long getSpotlightId() {
        return spotlightId;
    }

    public void setSpotlightId(Long spotlightId) {
        this.spotlightId = spotlightId;
    }

    @Override
    public String toString() {
        return String.format("Spotlight{spotlightId: %d}", spotlightId);
    }
}
