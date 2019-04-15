package com.example.securitydemo;

import com.example.securitydemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListReposity extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
