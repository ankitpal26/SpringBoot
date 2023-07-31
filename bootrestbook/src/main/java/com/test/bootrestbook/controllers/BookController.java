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

   @GetMapping("/books")
    public List<Book> getBooks(){

        return this.bookService.getAllBook();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){

       return bookService.getBookById(id);
    }
}
