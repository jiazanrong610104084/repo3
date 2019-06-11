package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    List<Account> fainAll();

    /**
     * 添加方法
     * @param account
     */
    void svaeAccount(Account account);

}
