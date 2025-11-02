package com.example.atablevotingsystembackend.controller;

import com.example.atablevotingsystembackend.dto.DailyItemRequestDTO;
import com.example.atablevotingsystembackend.dto.DailyItemResponseDTO;
import com.example.atablevotingsystembackend.dto.DishRequestDTO;
import com.example.atablevotingsystembackend.model.DailyItem;
import com.example.atablevotingsystembackend.model.Dish;
import com.example.atablevotingsystembackend.service.DailyItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/dailyItems")
public class DailyItemController {

    private final DailyItemService dailyItemService;

    @Autowired
    public DailyItemController(DailyItemService dailyItemService){
        this.dailyItemService = dailyItemService;
    }

    @PostMapping("/")
    public ResponseEntity<?> create(@Valid @RequestBody DailyItemRequestDTO dto) {
        DailyItem dailyItem = dailyItemService.create(dto);

        DailyItemResponseDTO out = new DailyItemResponseDTO(dailyItem.getId(), dailyItem.getDish().getId(), dailyItem.getRestaurant().getId(), dailyItem.getDate());
        return  ResponseEntity.status(HttpStatus.CREATED).body(out);
    }
}
