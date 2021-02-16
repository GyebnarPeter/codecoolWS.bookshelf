package com.codecool.bookshelf.model.books;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Author {
    private long id;
    private final String name;
    private final Date birthDate;
    private List<Book> bibliography = new ArrayList<>();

    public Author(String name, Date birthDate, List<Book> bibliography, long id) {
        this.name = name;
        this.birthDate = birthDate;
        this.bibliography = bibliography;
        this.id = id;
    }

    public void addBookToBibliography(Book book) {
        bibliography.add(book);
    }
}
