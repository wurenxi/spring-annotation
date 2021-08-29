package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/23 21:34
 */
public class MainTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("beans.xml");
//
//        Person bean = applicationContext.getBean("person", Person.class);
//        System.out.println(bean);

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);

        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : namesForType) {
            System.out.println(name);
        }
    }
}
