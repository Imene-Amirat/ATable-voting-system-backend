package com.example.atablevotingsystembackend.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DailyItemRequestDTO {
    @NotNull
    private Long dishId;

    @NotNull
    private Long restoId;

    @NotNull
    private LocalDate date;
}
