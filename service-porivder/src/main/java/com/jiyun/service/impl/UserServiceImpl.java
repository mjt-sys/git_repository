package com.jiyun.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.jiyun.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String findName() {

        return "hello,du..";
    }
}
