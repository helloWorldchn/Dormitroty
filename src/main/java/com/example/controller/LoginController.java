package com.example.controller;

import com.example.pojo.Admin;
import com.example.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/user/login")
    //@ResponseBody//这个注解可以取消mvc的视图跳转功能
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        System.out.println(username+"->"+password);
        Admin admin = adminService.getLoginAdmin(username);
        System.out.println("Login->"+admin);
        //具体的业务
        if (admin != null && password.equals(admin.getAdminPassword())) {
            session.setAttribute("loginUser", admin);
            model.addAttribute("loginUser", admin);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    //@ResponseBody//这个注解可以取消mvc的视图跳转功能
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/index.html";
    }
}
