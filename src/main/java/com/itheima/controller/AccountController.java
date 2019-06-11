package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    ModelAndView mv= new ModelAndView();
    @Autowired
    private AccountService ac;
    @RequestMapping("/fainAll")
    public ModelAndView fainAll(){
        System.out.println("查询所有方法执行了");
        List<Account> accounts = ac.fainAll();
        for (Account account : accounts) {
            System.out.println(account);

        }
        mv.addObject("account",accounts);
        mv.setViewName("list");
        return mv;
    }
    @RequestMapping("/svaeAccount")
    public String svaeAccount(Account account){
        ac.svaeAccount(account);
        return "list";
    }
}
