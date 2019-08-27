package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: hekuan
 * @Date: 2019/7/21 0021 12:11
 * @Description:
 */

@RestController
public class Controller {
    @Autowired
    UserMapper userMapper;



    @RequestMapping("/hello")
    public String hello(){
        User user=new User();
        user.setUsername("何宽");

        for (int a=0;a<5;a++){
            userMapper.regist(user);
        }

        return "成功";
    }
}
