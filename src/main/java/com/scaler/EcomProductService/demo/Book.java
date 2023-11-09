package com.scaler.EcomProductService.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookName;
    @ManyToOne
    @JoinColumn(name = "author_Id")
    private Author author;

    public Book() {
    }

    public Book(String bookName, Author author) {
        this.bookName = bookName;
        this.author = author;
    }
}
