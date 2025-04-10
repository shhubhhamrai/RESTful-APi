package com.example.hellospringboot.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public ResponseEntity<Object> healthCheck(){
        return ResponseEntity.status(HttpStatus.OK.value()).body(HttpStatus.OK.value());
    }
}
