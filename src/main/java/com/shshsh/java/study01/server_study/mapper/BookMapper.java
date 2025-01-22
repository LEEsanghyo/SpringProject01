package com.shshsh.java.study01.server_study.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shshsh.java.study01.server_study.model.Book;

@Repository
@Mapper
public interface BookMapper {
    List<Book> getBookList();
}
