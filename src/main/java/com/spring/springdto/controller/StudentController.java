package com.spring.springdto.controller;
import com.spring.springdto.dto.StudentDto;
import com.spring.springdto.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService ;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @GetMapping
//    public List<StudentDto> getAllStudents(){
//        return studentService.getAllStudent();
//    }
    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudents(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }
}
