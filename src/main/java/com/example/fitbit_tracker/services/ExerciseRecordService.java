package com.example.fitbit_tracker.services;

import com.example.fitbit_tracker.models.ExerciseRecord;
import com.example.fitbit_tracker.repositories.ExerciseRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseRecordService {

    @Autowired
    private ExerciseRecordRepository exerciseRecordRepository;

    public List<ExerciseRecord> getAllExerciseRecords() {
        return exerciseRecordRepository.findAll();
    }

    public List<ExerciseRecord> getExerciseRecordsByUserId(Long userId) {
        return exerciseRecordRepository.findByUserId(userId);
    }

    public ExerciseRecord saveExerciseRecord(ExerciseRecord exerciseRecord) {
        return exerciseRecordRepository.save(exerciseRecord);
    }

    public void deleteExerciseRecord(Long id) {
        exerciseRecordRepository.deleteById(id);
    }
}

