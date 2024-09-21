package com.example.fitbit_tracker.repositories;

import com.example.fitbit_tracker.models.ExerciseRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRecordRepository extends JpaRepository<ExerciseRecord, Long> {
    List<ExerciseRecord> findByUserId(Long userId);
}