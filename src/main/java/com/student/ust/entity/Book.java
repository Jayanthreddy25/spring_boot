package com.student.ust.entity;

import  lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "book_ust_details_identity")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    private String bookAuthorName;
    private int bookIsbnNo;

    @ManyToOne
    private Student student;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;



}


