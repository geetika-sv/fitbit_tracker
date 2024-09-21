package com.example.fitbit_tracker.controllers;

import com.example.fitbit_tracker.models.ExerciseRecord;
import com.example.fitbit_tracker.services.ExerciseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercise-records")
public class ExerciseRecordController {

    @Autowired
    private ExerciseRecordService exerciseRecordService;

    @GetMapping
    public List<ExerciseRecord> getAllExerciseRecords() {
        return exerciseRecordService.getAllExerciseRecords();
    }

    @GetMapping("/user/{userId}")
    public List<ExerciseRecord> getExerciseRecordsByUserId(@PathVariable Long userId) {
        return exerciseRecordService.getExerciseRecordsByUserId(userId);
    }

    @PostMapping
    public ExerciseRecord createExerciseRecord(@RequestBody ExerciseRecord exerciseRecord) {
        return exerciseRecordService.saveExerciseRecord(exerciseRecord);
    }

    @DeleteMapping("/{id}")
    public void deleteExerciseRecord(@PathVariable Long id) {
        exerciseRecordService.deleteExerciseRecord(id);
    }
}
