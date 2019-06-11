package com.itheima.controller;

import com.itheima.bean.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author 王磊
 * @Date 2019/6/5/005
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService ;

    /**
     * 用户登录功能
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("name")String name, @RequestParam("password")String password, HttpSession session, Model model){
        User user = userService.login(name, password);
        if(user==null){
            model.addAttribute("msg","用户名或密码错误!");
            return "login" ;
        }
        //将用户信息保存到session
        session.setAttribute("logiend",user);
        return "redirect:/student/all";
    }
}
