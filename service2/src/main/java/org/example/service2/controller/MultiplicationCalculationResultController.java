package org.example.service2.controller;

import lombok.RequiredArgsConstructor;
import org.example.service2.model.MultiplicationCalculationResult;
import org.example.service2.service.MultiplicationCalculationResultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/service2")
@RequiredArgsConstructor
public class MultiplicationCalculationResultController {
    private final MultiplicationCalculationResultService sumCalculationResultService;

    @GetMapping
    public ResponseEntity<List<MultiplicationCalculationResult>> getResults(
            @RequestParam(required = false) Integer firstArgument,
            @RequestParam(required = false) Integer secondArgument,
            @RequestParam(required = false) Integer result,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {

        return ResponseEntity.ok(sumCalculationResultService.getResults(firstArgument, secondArgument, result, sortBy, sortDirection));
    }
}
