package org.example.service2.controller;

import lombok.RequiredArgsConstructor;
import org.example.service2.service.ProcessService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/service2/calculate")
@RequiredArgsConstructor
public class ProcessController {
    private final ProcessService processService;

    @GetMapping
    public ResponseEntity<String> process(@RequestParam Integer firstArgument, @RequestParam Integer secondArgument, @RequestParam Integer thirdArgument) {
        return ResponseEntity.ok(processService.calculateNumbers(firstArgument, secondArgument, thirdArgument));
    }
}
