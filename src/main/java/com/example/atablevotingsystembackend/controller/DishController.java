package com.example.atablevotingsystembackend.controller;

import com.example.atablevotingsystembackend.dto.DishRequestDTO;
import com.example.atablevotingsystembackend.dto.DishResponseDTO;
import com.example.atablevotingsystembackend.model.Dish;
import com.example.atablevotingsystembackend.service.DishService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/dishes")
public class DishController {

    private final DishService dishService;

    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @PostMapping("/")
    public ResponseEntity<DishResponseDTO> create(@Valid @RequestBody DishRequestDTO dto) {
        Dish dish = dishService.create(dto);

        DishResponseDTO out = new DishResponseDTO(dish.getId(),dish.getName(),dish.getPrice(),dish.getRestaurant().getId());

        return ResponseEntity.status(HttpStatus.CREATED).body(out);
    }
}
