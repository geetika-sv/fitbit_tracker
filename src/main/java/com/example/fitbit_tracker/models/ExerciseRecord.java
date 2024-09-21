package com.example.fitbit_tracker.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "exercise_records")

public class ExerciseRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String exerciseType;
    private int duration;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
