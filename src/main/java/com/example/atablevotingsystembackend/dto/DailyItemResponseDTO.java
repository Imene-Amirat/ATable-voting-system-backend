package com.example.atablevotingsystembackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DailyItemResponseDTO {
    private Long id;
    private Long dishId;
    private Long restoId;
    private LocalDate date;
}
