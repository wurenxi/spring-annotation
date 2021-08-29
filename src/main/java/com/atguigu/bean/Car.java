package com.atguigu.bean;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/24 19:48
 */
@Component
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car init ...");
    }

    public void destroy(){
        System.out.println("car destroy ...");
    }
}
