package com.shshsh.java.study01.server_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

import com.shshsh.java.study01.server_study.model.Book;
import com.shshsh.java.study01.server_study.service.BookService;
import com.shshsh.java.study01.server_study.mapper.BookMapper;

import java.util.List;

@RestController
@RequestMapping("/service")
public class MainContoller {

    BookMapper bookMapper;

    @Autowired
    BookService bookService = new BookService(bookMapper);

    @RequestMapping(value = "/bookinfo", method = RequestMethod.GET)
    public List<Book> GetBookList() {
        List<Book> booklist = bookService.getBookList();

        System.out.println("here1" + booklist.get(0));
        return booklist;
    }
}
