package com.workout.api.repository;

import com.workout.api.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJpaRepository extends JpaRepository<Board, Long> {
    Board findByName(String name);
}
