package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/regist")
    public String save(User user){
        userService.save(user);
        return "user/login";
    }

    @RequestMapping("/login")
    public String findAll(User user, HttpServletRequest request){

        User users = userService.findOne(user);

        if(users!=null&&users.getUsername().length()>0&&users.getPassword().length()>0){
            request.getSession().setAttribute("one",users);
            return "redirect:/dept/queryAll";
        }else {
            return "user/login";
        }
    }
}
