package com.example.atablevotingsystembackend.service;

import com.example.atablevotingsystembackend.dto.DailyItemRequestDTO;
import com.example.atablevotingsystembackend.model.DailyItem;
import com.example.atablevotingsystembackend.model.Dish;
import com.example.atablevotingsystembackend.model.Restaurant;
import com.example.atablevotingsystembackend.repository.DailyItemRepository;
import com.example.atablevotingsystembackend.repository.DishRepository;
import com.example.atablevotingsystembackend.repository.RestaurantRepository;
import com.example.atablevotingsystembackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyItemService {

    private final DailyItemRepository dailyItemRepository;
    private final DishRepository dishRepository;
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public DailyItemService(DailyItemRepository dailyItemRepository, DishRepository dishRepository, RestaurantRepository restaurantRepository) {
        this.dailyItemRepository = dailyItemRepository;
        this.dishRepository = dishRepository;
        this.restaurantRepository = restaurantRepository;
    }

    public DailyItem create(DailyItemRequestDTO dto) {
        DailyItem dailyItem  = new DailyItem();
        dailyItem.setDate(dto.getDate());

        Restaurant restaurant = restaurantRepository.findById(dto.getRestoId()).orElseThrow(() -> new IllegalArgumentException("Restaurant not found"));
        Dish dish = dishRepository.findById(dto.getDishId()).orElseThrow(() -> new IllegalArgumentException("Dish not found"));

        dailyItem.setRestaurant(restaurant);
        dailyItem.setDish(dish);

        dailyItemRepository.save(dailyItem);

        return dailyItem;
    }
}
