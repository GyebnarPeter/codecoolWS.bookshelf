package com.codecool.bookshelf.dao;

import com.codecool.bookshelf.model.books.Author;
import com.codecool.bookshelf.model.books.Book;
import java.util.List;

public interface BookshelfDao {

   public void addBook(Book book);
   public Book findByTitle(long id);
   public Book findBooksByTitle(String title);
   public List<Book> findBooksByAuthor(Author author);

}
