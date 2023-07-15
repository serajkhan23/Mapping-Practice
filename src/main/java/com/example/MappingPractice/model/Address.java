package com.example.MappingPractice.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    private Long addressId;
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
