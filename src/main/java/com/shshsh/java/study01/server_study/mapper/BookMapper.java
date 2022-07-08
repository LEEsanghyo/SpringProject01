package com.shshsh.java.study01.server_study.mapper;

import com.shshsh.java.study01.server_study.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookMapper {
    List<Book> getBookList();
}
