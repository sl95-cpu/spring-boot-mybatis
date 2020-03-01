package com.sl.srpingboot001.controller;

import com.sl.srpingboot001.pojo.User;
import com.sl.srpingboot001.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/user/login")
    public String login(User user, Model model, HttpSession session){
        if(userService.login(user)!=null){
            session.setAttribute("user",user);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","用户名或密码错误!");
            return "index";
        }
    }
    @RequestMapping("/user/logout")
    public String out(HttpSession session){
        //移除session
        session.invalidate();
        return "redirect:/index.html";
    }
}
