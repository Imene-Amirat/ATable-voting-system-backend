package com.example.atablevotingsystembackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "daily_item", uniqueConstraints = {@UniqueConstraint(columnNames = {"resto_id", "dish_id", "date"}, name = "daily_item_unique")})
public class DailyItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "dish_id", nullable = false)
    private Dish dish;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "resto_id",  nullable = false)
    private Restaurant restaurant;

    @NotNull
    private LocalDate date;
}
