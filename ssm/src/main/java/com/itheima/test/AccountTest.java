package com.itheima.test;

import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceimpl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xiaobai
 * @Param:
 * @Description:
 */
public class AccountTest {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService service = (AccountService) ac.getBean("accountService");
        service.findAll();
    }
}
