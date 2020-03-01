package com.sl.srpingboot001.config;

import com.sl.srpingboot001.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      //登陆成功之后 会有用的 session
        User user =  (User)request.getSession().getAttribute("user");
       if (user==null){
           request.setAttribute("msg","请登录之后访问");
           request.getRequestDispatcher("/index.html").forward(request,response);
           return false;
       }
        return true;
    }

}
