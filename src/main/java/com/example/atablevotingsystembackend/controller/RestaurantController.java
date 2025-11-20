package com.example.atablevotingsystembackend.controller;

import com.example.atablevotingsystembackend.dto.RestaurantCardDTO;
import com.example.atablevotingsystembackend.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/")
    public List<RestaurantCardDTO> getOwnerRestaurants() {
        return restaurantService.getRestaurantsForOwner();
    }
}
