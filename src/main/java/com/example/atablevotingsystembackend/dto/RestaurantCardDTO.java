package com.example.atablevotingsystembackend.dto;

import com.example.atablevotingsystembackend.model.Status;
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
