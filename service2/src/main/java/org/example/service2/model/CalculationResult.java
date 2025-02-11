package org.example.service2.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "multiplications")
public class CalculationResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_argument")
    private Integer firstArgument;

    @Column(name = "second_argument")
    private Integer secondArgument;

    @Column(name = "result")
    private Integer result;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    public CalculationResult(Integer firstArgument, Integer secondArgument, Integer result, LocalDateTime startTime, LocalDateTime endTime) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        this.result = result;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
