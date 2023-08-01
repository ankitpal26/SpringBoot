package com.test.bootrestbook.controllers;


import com.test.bootrestbook.entities.Book;
import com.test.bootrestbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    //get all book handler
   @GetMapping("/books")
    public List<Book> getBooks(){

        return this.bookService.getAllBook();
    }


    //get single book handler
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){

       return bookService.getBookById(id);
    }

    //add new book handler
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book)
    {
       Book b= this.bookService.addBook(book);
        System.out.println(b);
        return b;
    }

    //delete book handler

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable ("bookId") int bookId)
    {
       this.bookService.deleteBook(bookId);

    }



}
