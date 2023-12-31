package com.test.bootrestbook.dao;

import com.test.bootrestbook.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findById(int id);
}
