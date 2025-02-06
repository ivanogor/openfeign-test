package org.example.service1.controller;

import org.example.service1.service.FirstService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/service1")
public class FirstController {
    private final FirstService service1;

    public FirstController(FirstService service1) {
        this.service1 = service1;
    }

    @GetMapping("/calculate")
    public ResponseEntity<Integer> calculate(@RequestParam Integer number) {
        return ResponseEntity.ok(service1.calculate(number));
    }
}