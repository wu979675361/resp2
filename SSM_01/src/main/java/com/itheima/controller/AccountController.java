package com.itheima.controller;


import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("test01")
    public String test01(){
        accountService.findAll();
        return "success";
    }

    /**
     * 用于查找
     * @return
     */
    @RequestMapping("test02")
    public ModelAndView test02(){
        ModelAndView md = new ModelAndView();
        //调用查找方法
        List<Account> list = accountService.findAll();
        md.addObject("list",list);
        md.setViewName("success");
        return md;
    }


    /**
     * 用于储存账户
     * @return
     */
    @RequestMapping("test03")
    public void test03(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        //调用储存的方法
        System.out.println("保存账户");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/user/test02");
        return;
    }
}
