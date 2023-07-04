package com.example.feignclientexample.controller;

import com.example.feignclientexample.entity.BookEntity;
import com.example.feignclientexample.service.BookFeignService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookFallBack implements FeignClientEx {

    private final BookFeignService bookFeignService;

    @Override
    public BookEntity findByName(String name) {
        return bookFeignService.getBookByName(name);
    }
}
