package com.spring.springdto.repository;

import com.spring.springdto.model.Course;
import com.spring.springdto.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
