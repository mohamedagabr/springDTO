package com.spring.springdto.model;

import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;

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
    private String studentAge ;
}
