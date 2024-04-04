package com.colak.springjptutorial.tutorial.jpa.embeddable.repository;

import com.colak.springjptutorial.tutorial.jpa.embeddable.jpa.Person;
import com.colak.springjptutorial.tutorial.jpa.embeddable.jpa.PhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository repository;

    @Test
    @Transactional
    void findAll() {
        List<Person> personList = repository.findAll();
        Person first = personList.getFirst();
        List<PhoneNumber> phoneNumbers = first.getPhoneNumbers();

        List<PhoneNumber> expected = List.of(new PhoneNumber("2"), new PhoneNumber("1"));
        Assertions.assertEquals(expected, phoneNumbers);
    }
}
