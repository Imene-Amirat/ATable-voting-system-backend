package com.example.atablevotingsystembackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "date"}, name = "user_unique_vote")})
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "resto_id", nullable = false)
    private Restaurant Restaurant;

    @NotNull
    private LocalDate date;
}
