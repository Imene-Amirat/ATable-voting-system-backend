package com.example.atablevotingsystembackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    @NotBlank
    private String name;

    @Column(nullable = false)
    @NotBlank
    private String city;

    @Column(nullable = false)
    @NotBlank
    private String address;

    private String description;

    @Column(nullable = false)
    @NotBlank
    private String category;

    @Column(length = 10)
    private String phone;

    private String photoUrl;

    private String website;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status = Status.PENDING;

    @Column(precision = 3, scale = 2)
    private BigDecimal rating = BigDecimal.ZERO; // default 0.0

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY) //Prevents loading the whole owner entity unnecessarily
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;
}
