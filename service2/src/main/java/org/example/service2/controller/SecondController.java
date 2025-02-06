package org.example.service2.controller;

import org.example.service2.service.SecondService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/service2")
public class SecondController {
    private final SecondService secondService;

    public SecondController(SecondService secondService) {
        this.secondService = secondService;
    }

    @GetMapping("/process")
    public ResponseEntity<String> process(@RequestParam Integer number) {
        return ResponseEntity.ok(secondService.process(number));
    }
}
