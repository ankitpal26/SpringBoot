package com.test.bootrestbook.services;

import com.test.bootrestbook.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        try {
            book = list.stream().filter(e->e.getId()==id).findFirst().get();
        }catch (Exception e){
            e.printStackTrace();
        }

        return  book;
    }

    //adding the book
    public Book addBook(Book b)
    {
        list.add(b);
        return  b;
    }
    //delete book
    public void deleteBook(int bid)
    {
       list = list.stream().filter(book -> book.getId()!=bid).
                collect(Collectors.toList());
    }

    //update book
    public void updateBook(Book book, int bookId)
    {
      list =  list.stream().map(b ->{
            if(b.getId()==bookId)
            {
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());
    }
}
