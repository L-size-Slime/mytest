package com.wit.mytest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String login(){
        return "login";//跳转到templates下的login.html页面，前提是thymeleaf依赖已经导入
    }
}
