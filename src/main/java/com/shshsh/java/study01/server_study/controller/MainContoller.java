package com.shshsh.java.study01.server_study.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shshsh.java.study01.server_study.model.Book;
import com.shshsh.java.study01.server_study.service.BookService;

@RestController
@RequestMapping("/service")
public class MainContoller {

    BookService bookService;

    @RequestMapping(value = "/bookinfo", method = RequestMethod.GET)
    public List<Book> GetBookList() {
        List<Book> booklist = bookService.getBookList();

        System.out.println("here1" + booklist.get(0));
        return booklist;
    }
}
