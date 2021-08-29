package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.bean.Yellow;
import com.atguigu.config.MainConfigOfProfile;
import com.atguigu.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.sql.DataSource;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/24 19:50
 */
public class IOCTest_Profile {

    //1、使用命令行动态参数：在虚拟机参数位置加载 -Dspring.profiles.active=test
    //2、代码的方式激活某种环境；
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        //1.创建一个applicationContext
        //2.设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("test");
        //3.注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        //4.启动刷新容器
        applicationContext.refresh();


        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String string : namesForType) {
            System.out.println(string);
        }

        Yellow yellow = applicationContext.getBean(Yellow.class);
        System.out.println(yellow);
    }
}
