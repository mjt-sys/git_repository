package com.jiyun.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiyun.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Usercontroller {

    @Reference
    UserService us;

    @RequestMapping("/findName")
    @ResponseBody
    public String findName(){
          giao
        return us.findName();
    }

}
