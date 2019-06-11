package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountTest {
    @Autowired
    private AccountService ac;
    @Test
    public void demo1(){
        List<Account> accounts = ac.fainAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
