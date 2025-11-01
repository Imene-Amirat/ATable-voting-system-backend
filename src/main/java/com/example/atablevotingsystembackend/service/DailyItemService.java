package com.example.atablevotingsystembackend.service;

import com.example.atablevotingsystembackend.repository.DailyItemRepository;
import com.example.atablevotingsystembackend.repository.DishRepository;
import com.example.atablevotingsystembackend.repository.RestaurantRepository;
import com.example.atablevotingsystembackend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DailyItemService {

    private final DailyItemRepository dailyItemRepository;
    private final DishRepository dishRepository;
    private final RestaurantRepository restaurantRepository;

    public DailyItemService(DailyItemRepository dailyItemRepository, DishRepository dishRepository, RestaurantRepository restaurantRepository) {
        this.dailyItemRepository = dailyItemRepository;
        this.dishRepository = dishRepository;
        this.restaurantRepository = restaurantRepository;
    }
}
