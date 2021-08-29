package com.atguigu.test;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfigOfAOP;
import com.atguigu.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/24 19:50
 */
public class IOCTest_Ext {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(ExtConfig.class);

    @Test
    public void test01(){

        //发布的事件
        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
        });

        applicationContext.close();
    }
}
