package com.colak.springjptutorial.repository;

import com.colak.springjptutorial.jpa.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
