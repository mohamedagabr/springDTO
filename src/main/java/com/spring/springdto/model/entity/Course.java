package com.spring.springdto.model.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="courses")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    private int courseId ;
    @Column(name="course_name")
    private String courseName ;
    @Column(name = "course_cost", precision = 10, scale = 2)
    private BigDecimal courseCost ;
    @Column(name="course_time")
    private Integer courseTime ;
    @OneToMany(mappedBy = "course" , fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<StudentCourse> studentCourses = new HashSet<>() ;


 }
