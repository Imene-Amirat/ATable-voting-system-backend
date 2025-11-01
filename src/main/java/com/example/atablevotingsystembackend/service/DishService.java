package com.example.atablevotingsystembackend.service;

import com.example.atablevotingsystembackend.dto.DishRequestDTO;
import com.example.atablevotingsystembackend.model.Dish;
import com.example.atablevotingsystembackend.model.Restaurant;
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

    public Dish create(DishRequestDTO dto) {
        Dish dish = new Dish();
        dish.setName(dto.getDishName());
        dish.setPrice(dto.getPrice());

        //return object resto by his id
        Restaurant r = restaurantRepository.findById(dto.getRestoId()).orElseThrow(() -> new IllegalArgumentException("Restaurant not found"));
        dish.setRestaurant(r);

        dishRepository.save(dish);

        return dish;
    }
}
