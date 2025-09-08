package com.spring.springdto.mapper;
import com.spring.springdto.dto.CourseDto;
import com.spring.springdto.model.entity.Course;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface CourseMapper {
    CourseDto toDto(Course course);
    Course toEntity (CourseDto courseDto);

}
