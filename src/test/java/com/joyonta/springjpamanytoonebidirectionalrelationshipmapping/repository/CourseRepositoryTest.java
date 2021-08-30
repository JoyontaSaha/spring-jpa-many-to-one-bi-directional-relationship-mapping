package com.joyonta.springjpamanytoonebidirectionalrelationshipmapping.repository;

import com.joyonta.springjpamanytoonebidirectionalrelationshipmapping.entity.Course;
import com.joyonta.springjpamanytoonebidirectionalrelationshipmapping.entity.Instructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private EntityManager entityManager;

    @Test
    public void saveCourses() {

        Instructor instructor = Instructor.builder()
                .firstName("Ramesh")
                .lastName("Fadatare")
                .email("ramesh@javaguides.com")
                .build();


        // create some courses
        Course course1 = Course.builder()
                .title("Air Guitar - The Ultimate Guide")
                .instructor(instructor)
                .build() ;

        Course course2 = Course.builder()
                .title("The Pinball Masterclass")
                .instructor(instructor)
                .build() ;


        Iterable<Course> courseIterable = Arrays.asList(course1, course2);

        courseRepository.saveAll(courseIterable);
    }

    @Test
    public void printCourses() {
        System.out.println("Courses: " + courseRepository.findAll());
    }
}