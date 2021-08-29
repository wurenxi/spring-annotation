package com.atguigu.dao;

import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/23 21:47
 */
//名字默认是类名首字母小写
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
