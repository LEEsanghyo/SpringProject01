package com.shshsh.java.study01.server_study.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shshsh.java.study01.server_study.DataObject.Book;

@RestController
@RequestMapping("/service")
public class MainContoller {

    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/homeparty", method = RequestMethod.GET)
    public String homeparty(String input) {
        return "homeparty" + input;
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public Book GetBookInfo() {
        Book book = new Book();
        book.setSeq(1);
        book.setTitle("책 제목");
        book.setPublisher("이상효");
        book.setCreator("대한민국");
        book.setPublishedYear(2022);
        return book;
    }
}
