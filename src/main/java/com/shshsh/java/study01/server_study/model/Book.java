package com.shshsh.java.study01.server_study.model;

import lombok.Data;

@Data
public class Book {
    private long seq;
    private String title;
    private String creator;
    private String publisher;
    private int publishedYear;
}
