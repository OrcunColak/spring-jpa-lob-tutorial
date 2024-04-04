package com.colak.springjptutorial.repository;

import com.colak.springjptutorial.jpa.Book;
import com.colak.springjptutorial.jpa.BookContent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookContentRepositoryTest {

    @Autowired
    private BookContentRepository repository;

    @Test
    void testSave() {
        Book book = new Book();
        book.setTitle("Book 4");

        BookContent bookContent = new BookContent();
        bookContent.setBook(book);
        bookContent.setContent("Content");

        repository.save(bookContent);
    }
}
