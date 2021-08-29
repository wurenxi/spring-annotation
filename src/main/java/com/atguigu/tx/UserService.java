package com.atguigu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/27 19:54
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void insertUser(){
        userDao.insert();
        //otherDao.otherMethod();
        System.out.println("插入完成");
        int i = 10 / 0;
    }
}
