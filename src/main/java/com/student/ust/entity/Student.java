package com.student.ust.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Data

@Table(name = "student_ustbatch_identity")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    private String name;
    private int age;
    private int roll_no;

    @OneToOne
    @JoinColumn(name="book_id")
    private Book book;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "student")
    private Set<Book> bookSet;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

}
