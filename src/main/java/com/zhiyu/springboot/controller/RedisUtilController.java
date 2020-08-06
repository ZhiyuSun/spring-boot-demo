package com.zhiyu.springboot.controller;

import com.zhiyu.springboot.entity.User;
import com.zhiyu.springboot.utils.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/redis")
@RestController
public class RedisUtilController {
    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("set")
    public boolean redisset(String key, String value){
        User user =new User();
        user.setName("zhangsan");
        user.setPassword("zhangsan");
        return redisUtil.set(key,user,ExpireTime);
//        return redisUtil.set(key,value);
    }

    @RequestMapping("get")
    public Object redisget(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key, ExpireTime);
    }
}
