package com.spring.springdto.service;
import com.spring.springdto.dto.StudentDto;
import com.spring.springdto.mapper.StudentMapper;
import com.spring.springdto.model.entity.Student;
import com.spring.springdto.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository ;
    private final StudentMapper studentMapper ;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public List<StudentDto> getAllStudent(){
      return   studentRepository.findAll()
              .stream()
              .map(studentMapper::toDto)
              .toList();
    }
    public List<Student> getAllStudentR(){
      return   studentRepository.findAll();

    }
}
