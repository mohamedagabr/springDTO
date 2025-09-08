package com.spring.springdto.mapper;
import com.spring.springdto.dto.StudentDto;
import com.spring.springdto.model.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDto toDto(Student student) ;
    Student toEntity(StudentDto studentDto);

}
