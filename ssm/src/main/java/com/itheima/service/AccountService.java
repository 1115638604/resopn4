package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xiaobai
 * @Param:
 * @Description:
 */

public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存
     * @param account
     */
    public void saveAccount(Account account);
}
