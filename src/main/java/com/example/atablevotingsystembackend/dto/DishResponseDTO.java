package com.example.atablevotingsystembackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DishResponseDTO {
    private Long id;
    private String dishName;
    private BigDecimal price;
    private Long restoId;
}
