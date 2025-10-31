package com.example.atablevotingsystembackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"resto_id", "name"}, name = "dish_unique_name_per_restaurant")})
@AllArgsConstructor
@NoArgsConstructor
//catalogue des plats du resto (créés une fois, réutilisés)
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    @PositiveOrZero
    private BigDecimal price;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "resto_id", nullable = false)
    private Restaurant restaurant;
}
