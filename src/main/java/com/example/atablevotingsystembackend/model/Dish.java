package com.example.atablevotingsystembackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private BigDecimal price;

    @NotNull
    private LocalDate date;  // plat du jour

    @ManyToOne
    @JoinColumn(name = "resto_id", nullable = false)
    private Restaurant restaurant;
}
