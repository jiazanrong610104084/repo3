package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao ad;
    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Account> fainAll() {
        System.out.println("查询所有方法执行了");
        return ad.fainAll();
    }

    /**
     * 添加方法
     * @param account
     */
    @Override
    public void svaeAccount(Account account) {
        ad.svaeAccount(account);
    }
}
