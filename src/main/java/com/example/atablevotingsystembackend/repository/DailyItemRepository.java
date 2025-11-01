package com.example.atablevotingsystembackend.repository;

import com.example.atablevotingsystembackend.model.DailyItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyItemRepository extends JpaRepository<DailyItem, Long> {
}
