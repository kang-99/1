package com.kang.controller;


import com.kang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession session) {
        System.out.println(username);
        System.out.println(password);
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            session.setAttribute("loginuser",username);
            return "main";
        } else {
            model.addAttribute("msg", "账号或者密码错误，重新登录");
            return "login";
        }




    }
}
