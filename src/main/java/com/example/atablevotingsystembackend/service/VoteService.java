package com.example.atablevotingsystembackend.service;

import com.example.atablevotingsystembackend.repository.RestaurantRepository;
import com.example.atablevotingsystembackend.repository.UserRepository;
import com.example.atablevotingsystembackend.repository.VoteRepository;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    private final VoteRepository voteRepository;
    private final RestaurantRepository restaurantRepository;
    private final UserRepository userRepository;

    public VoteService(VoteRepository voteRepository, RestaurantRepository restaurantRepository, UserRepository userRepository) {
        this.voteRepository = voteRepository;
        this.restaurantRepository = restaurantRepository;
        this.userRepository = userRepository;
    }
}
