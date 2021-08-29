package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/23 21:47
 */
@Service
public class BookService {

//    @Qualifier("bookDao")
//    @Autowired(required = false)
//    @Resource(name = "bookDao2")
    @Inject
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }
}
