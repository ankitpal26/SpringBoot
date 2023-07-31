package com.test.bootrestbook.services;

import com.test.bootrestbook.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {

    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(12,"Java Complete reference","ABCD"));
        list.add(new Book(13,"Spring boot","XYZ"));
        list.add(new Book(14,"Hibernate  turorial","PQR"));
        list.add(new Book(15,"This is Java Spring Boot ","ABCD"));
    }

    //get all books
    public List<Book> getAllBook()
    {
        return list;
    }
    // get single book  by id

    public Book getBookById(int id)
    {
        Book book=null;
        book = list.stream().filter(e->e.getId()==id).findFirst().get();
        return  book;
    }

}
