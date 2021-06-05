package com.workout.api.repository;

import com.workout.api.entity.Board;
import com.workout.api.entity.Daily;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DailyJpaRepository extends JpaRepository<Daily, Long> {
    List<Daily> findByBoard(Board board);
}
