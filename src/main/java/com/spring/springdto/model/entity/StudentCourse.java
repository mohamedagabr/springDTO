package com.spring.springdto.model.entity;
import com.spring.springdto.model.id.StudentCourseId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_courses")
public class StudentCourse {
    @EmbeddedId
    private StudentCourseId studentCourseId ;
    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id", nullable = false)
    private Student student ;
    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

}
