package com.example.atablevotingsystembackend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DishRequestDTO {
    @NotBlank
    private String dishName;
    @NotNull
    @PositiveOrZero
    private BigDecimal price;
    @NotNull
    private Long restoId;
}
