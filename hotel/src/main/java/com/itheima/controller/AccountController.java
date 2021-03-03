package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/login")
    public String Login(String username , String password , Model model){

        Account username1 = accountService.findUsername(username);
        Account password1 = accountService.findPassword(password);

        if(username1 != null && password1 != null){
            return "next";
        }  else if(username1 == null) {
            model.addAttribute("errorUsername","用户名不存在,请重新输入");
            return "login";
        } else {
            model.addAttribute("errorPassword" , "密码错误,请重新输入");
            return "login";
        }
    }
}
