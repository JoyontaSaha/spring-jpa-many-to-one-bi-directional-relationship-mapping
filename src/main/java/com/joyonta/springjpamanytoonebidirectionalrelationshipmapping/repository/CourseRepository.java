package com.joyonta.springjpamanytoonebidirectionalrelationshipmapping.repository;

import com.joyonta.springjpamanytoonebidirectionalrelationshipmapping.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
