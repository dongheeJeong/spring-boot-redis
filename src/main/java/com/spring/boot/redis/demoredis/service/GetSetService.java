package com.spring.boot.redis.demoredis.service;

import com.spring.boot.redis.demoredis.model.Spotlight;
import com.spring.boot.redis.demoredis.model.User;
import com.spring.boot.redis.demoredis.model.UserSpotlight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class GetSetService {

    @Autowired
    RedisTemplate<String, Spotlight> redisTemplate;

    public String test() {
        ValueOperations<String, Spotlight> vop = redisTemplate.opsForValue();

        final String uid = "uid-test";
        vop.set(uid, new Spotlight(1234L));

        Spotlight result = vop.get(uid);
        System.out.println(result);//jdk
        return result.toString();
    }

}
