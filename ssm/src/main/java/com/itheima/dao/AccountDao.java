package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xiaobai
 * @Param:
 * @Description:
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    @Select("SELECT *FROM account")
    public List<Account> findAll();

    /**
     * 保存
     * @param account
     */
    @Insert("insert into account (name,money) values(#{name},#{money})")
   public void saveAccount(Account account);
}
