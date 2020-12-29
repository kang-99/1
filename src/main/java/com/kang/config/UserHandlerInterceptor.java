package com.kang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登陆成功，会有用户的session
        Object loginuser = request.getSession().getAttribute("loginuser");

        if(loginuser==null){//如果没有登录
            request.setAttribute("msg","没有登录，无法访问");
            request.getRequestDispatcher("/login.html").forward(request,response);
            return false;

        }else {
            return true;
        }
    }
}
