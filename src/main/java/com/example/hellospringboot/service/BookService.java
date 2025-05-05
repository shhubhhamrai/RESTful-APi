package com.example.hellospringboot.service;

import com.example.hellospringboot.entity.Book;
import com.example.hellospringboot.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public ResponseEntity<Object> healthCheck(){
        return ResponseEntity.ok(HttpStatus.OK.value());
    }

    public Book updateBook(Long id, Book updatedBook) {
        return bookRepository.save(updatedBook); // fallback
    }
}
