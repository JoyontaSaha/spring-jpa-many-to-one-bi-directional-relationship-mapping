package com.joyonta.springjpamanytoonebidirectionalrelationshipmapping.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InstructorRepositoryTest {
    @Autowired
    private InstructorRepository instructorRepository;


    @Test
    public void printInstructors() {
        System.out.println("Instructors = " + instructorRepository.findAll());
    }

}