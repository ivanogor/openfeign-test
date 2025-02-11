package org.example.service1.controller;

import lombok.RequiredArgsConstructor;
import org.example.service1.service.SumService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/service1")
@RequiredArgsConstructor
public class SumController {
    private final SumService sumService;

    @GetMapping("/calculate")
    public ResponseEntity<Integer> calculate(@RequestParam Integer firstArgument, @RequestParam Integer secondArgument) {
        return ResponseEntity.ok(sumService.sum(firstArgument, secondArgument));
    }
}