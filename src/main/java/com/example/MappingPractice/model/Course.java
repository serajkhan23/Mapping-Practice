package com.example.MappingPractice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    private String ID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinTable(name = "student_course-join_table",joinColumns = @JoinColumn(name = "fk_student_id"),
            inverseJoinColumns= @JoinColumn(name = "fk_student_id"))
    List<Student> studentList;
}
