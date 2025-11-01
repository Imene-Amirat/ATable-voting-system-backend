package com.example.atablevotingsystembackend.service;

import com.example.atablevotingsystembackend.repository.DishRepository;
import com.example.atablevotingsystembackend.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

@Service
public class DishService {

    private final DishRepository dishRepository;
    private final RestaurantRepository restaurantRepository;

    public DishService(DishRepository dishRepository, RestaurantRepository restaurantRepository) {
        this.dishRepository = dishRepository;
        this.restaurantRepository = restaurantRepository;
    }
}
