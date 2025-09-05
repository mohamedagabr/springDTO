package com.spring.springdto.service;

import com.spring.springdto.model.Student;
import com.spring.springdto.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository ;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
