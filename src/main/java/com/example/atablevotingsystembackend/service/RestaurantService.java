package com.example.atablevotingsystembackend.service;

import com.example.atablevotingsystembackend.dto.RestaurantCardDTO;
import com.example.atablevotingsystembackend.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<RestaurantCardDTO> getRestaurantsForOwner(){

    }
}
