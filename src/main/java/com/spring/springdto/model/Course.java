package com.spring.springdto.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

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

}
