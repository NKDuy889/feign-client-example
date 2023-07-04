package com.example.feignclientexample.service;

import com.example.feignclientexample.entity.BookEntity;

public interface BookFeignService {

    BookEntity getBookByName(String name);

}
