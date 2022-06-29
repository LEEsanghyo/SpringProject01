package com.shshsh.java.study01.server_study.service;

import com.shshsh.java.study01.server_study.model.Book;
import com.shshsh.java.study01.server_study.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    BookMapper bookMapper;

    public BookService(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public List<Book> getBookList() {
        return bookMapper.getBookList();
    }
}
