package com.atguigu.test;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfigOfAOP;
import com.atguigu.tx.TxConfig;
import com.atguigu.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/24 19:50
 */
public class IOCTest_Tx {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(TxConfig.class);

    @Test
    public void test01(){
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
    }
}
