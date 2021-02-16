package com.codecool.bookshelf;

import com.codecool.bookshelf.model.books.Book;
import com.codecool.bookshelf.model.user.Customer;

import java.util.Date;
import java.util.List;

import static com.codecool.bookshelf.model.books.GenreType.SCIFI;

public class MyMockDatabase {

    private List<Customer> customerList;
    private List<Book> bookListOnShelf;

    public List<Customer> uploadCustomerList() {
        customerList.add(new Customer("Brad Pitt", new Date(1955-10-10), "email@email.com", 12034));
        customerList.add(new Customer("Arnold Schwarzenegger", new Date(1961-10-10), "email@email.com", 12035));
        customerList.add(new Customer("Sylvester Stallone", new Date(1960-10-10), "email@email.com", 12036));
        customerList.add(new Customer("Jason Statham", new Date(1971-10-10), "email@email.com", 12037));
        customerList.add(new Customer("Chuck Norris", new Date(1952-10-10), "email@email.com", 12038));
        customerList.add(new Customer("Bruce Willis", new Date(1956-10-10), "email@email.com", 12039));
        customerList.add(new Customer("Jet Li", new Date(1974-10-10), "email@email.com", 12040));
        return customerList;
    }

    public List<Book> uploadBookListOnShelf() {
        bookListOnShelf.add(new Book("Felhőatlasz","David Mitchell",2010,200, 100, SCIFI));
        bookListOnShelf.add(new Book("Gyűrűk ura","David Mitchell",2004,100, 100, SCIFI));
        bookListOnShelf.add(new Book("Hobbit","David Mitchell",2000,250, 100, SCIFI));
        bookListOnShelf.add(new Book("Harry Potter","David Mitchell",1999,300, 100, SCIFI));
        bookListOnShelf.add(new Book("Narnia","David Mitchell",2001,206, 100, SCIFI));
        bookListOnShelf.add(new Book("Dracula","David Mitchell",1982,180, 100, SCIFI));
        return bookListOnShelf;
    }

}
