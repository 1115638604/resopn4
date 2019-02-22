package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: xiaobai
 * @Param:
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
     public String findAll(){
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        return "list";
     }

     @RequestMapping("/save")
     public String update(Account account){
        accountService.saveAccount(account);
         System.out.println(account);
        return "list";
     }
}
