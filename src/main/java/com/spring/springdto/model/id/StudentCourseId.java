package com.spring.springdto.model.id;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourseId implements Serializable {
    private int studentId ;
    private int courseId ;

}
