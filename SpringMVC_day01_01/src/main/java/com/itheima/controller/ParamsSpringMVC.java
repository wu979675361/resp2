package com.itheima.controller;

import com.itheima.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 配置以及路径 params
 */
@Controller
@RequestMapping("params" )
public class ParamsSpringMVC {

    @RequestMapping(path = "paramstest01" ,params = {"username"})
    public String paramsTest01(String username){
        System.out.println(username);
        return "success";
    }

    @RequestMapping(path = "accountSave")
    public String accountSave(Account account){
        System.out.println(account);
        return "success";
    }
}
