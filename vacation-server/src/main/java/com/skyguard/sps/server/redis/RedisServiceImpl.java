package com.skyguard.sps.server.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Created by liupei on 2018/5/31.
 */
public class RedisServiceImpl {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Resource(name = "stringRedisTemplate")
    ValueOperations<String, String> valOpsStr;
    void addWithTimeOut(String key, String value, long seconds) {
        valOpsStr.set(key, value, seconds,TimeUnit.SECONDS);
    }

    void add(String key, String value) {
        valOpsStr.set(key, value);
    }
    String get(String key) {
        return valOpsStr.get(key);
    }

    void delete(String key) {
        stringRedisTemplate.delete(key);
    }
}
