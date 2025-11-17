package com.example.atablevotingsystembackend.dto;

import com.example.atablevotingsystembackend.model.Owner;
import com.example.atablevotingsystembackend.model.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantCardDTO {
    Long id;
    String name;
    String city;
    String address;
    String category;
    String description;
    String photoUrl;
    Status status;
    BigDecimal rating;
}
