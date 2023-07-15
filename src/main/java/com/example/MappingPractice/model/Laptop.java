package com.example.MappingPractice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Laptop {
    @Id
    private String ID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    @JoinColumn(name = "fk_studentId")
    private Student student;
}
