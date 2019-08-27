package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: hekuan
 * @Date: 2019/7/12 0012 17:21
 * @Description:
 */

@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model){

        model.addAttribute("abc","你好你好~~~");
        System.out.println("66666");
        return "success";
    }

    @RequestMapping("/aaa")
    public String hello1(){


        return "人傻了";
    }
}
