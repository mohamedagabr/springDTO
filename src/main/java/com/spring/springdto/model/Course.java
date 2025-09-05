package com.spring.springdto.model;
import jakarta.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name="courses")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId ;
    @Column(name="course_name")
    private String courseName ;
    @Column(name="course_cost")
    private Double courseCost ;
    @Column(name="course_time")
    private Timestamp courseTime ;
    @Column(name="student_id")
    private int studentId;
}
