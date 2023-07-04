package com.example.feignclientexample.controller;

import com.example.feignclientexample.entity.BookEntity;
import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "${api.url.local}", configuration = FeignClientsConfiguration.class)
public interface FeignClientEx {
    @GetMapping("/get-by-name")
    BookEntity findByName(@Param("name") String name);
}
