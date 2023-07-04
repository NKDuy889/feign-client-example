package com.example.feignclientexample.service.impl;

import com.example.feignclientexample.entity.BookEntity;
import com.example.feignclientexample.repository.BookRepository;
import com.example.feignclientexample.service.BookFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookFeignServiceImpl implements BookFeignService {
    private BookRepository bookRepository;

    @Override
    public BookEntity getBookByName(String name) {
        return bookRepository.findByName(name);
    }
}
