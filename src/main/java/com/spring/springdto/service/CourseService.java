package com.spring.springdto.service;

import com.spring.springdto.model.entity.Course;
import com.spring.springdto.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository ;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    public List<Course> getAllCoursesR(){
        return courseRepository.findAll();
    }
}
