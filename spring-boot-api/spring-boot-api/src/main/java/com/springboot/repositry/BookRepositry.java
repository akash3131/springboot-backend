package com.springboot.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Book;

public interface BookRepositry extends JpaRepository<Book, Integer> {

}
