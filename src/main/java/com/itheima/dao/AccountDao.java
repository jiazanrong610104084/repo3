package com.itheima.dao;

import com.itheima.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
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
