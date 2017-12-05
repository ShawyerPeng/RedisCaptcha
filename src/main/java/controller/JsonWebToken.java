package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by ShawyerPeng on 2017/12/5.
 */
public class JsonWebToken {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;


}
