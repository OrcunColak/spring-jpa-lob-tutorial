package com.colak.springjptutorial.repository;

import com.colak.springjptutorial.jpa.BookContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookContentRepository extends JpaRepository<BookContent, Long> {
}
