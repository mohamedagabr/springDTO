package com.spring.springdto.model.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.HashSet;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private int studentId;
    @Column(name="student_name")
    private String studentName;
    @Column(name="student_age")
    private Integer studentAge ;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<StudentCourse> studentCourses = new HashSet<>() ;

}
