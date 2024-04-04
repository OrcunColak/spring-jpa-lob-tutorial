package com.colak.springjptutorial.tutorial.jpa.separatetable.repository;

import com.colak.springjptutorial.tutorial.jpa.separatetable.jpa.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    @Transactional
    void findAll() {
        List<Employee> employeeList = repository.findAll();
        Employee first = employeeList.getFirst();
        List<String> phoneNumbers = first.getPhoneNumbers();

        List<String> expected = List.of("2", "1");
        Assertions.assertEquals(expected, phoneNumbers);
    }
}
