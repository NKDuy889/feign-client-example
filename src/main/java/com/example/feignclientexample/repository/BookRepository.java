package com.example.feignclientexample.repository;

import com.example.feignclientexample.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
    BookEntity findByName(String name);
}
