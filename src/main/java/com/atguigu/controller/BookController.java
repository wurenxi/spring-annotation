package com.atguigu.controller;

import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/23 21:46
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
