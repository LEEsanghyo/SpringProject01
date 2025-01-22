package com.shshsh.java.study01.server_study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shshsh.java.study01.server_study.mapper.BookMapper;
import com.shshsh.java.study01.server_study.model.Book;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService{

    private final BookMapper bookMapper;


    public List<Book> getBookList() {
        return bookMapper.getBookList();
    }
}
