package com.spring.springdto.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

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
    private LocalDateTime courseTime ;

}
