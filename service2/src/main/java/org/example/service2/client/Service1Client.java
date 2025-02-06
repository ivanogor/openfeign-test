package org.example.service2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service1", url = "http://localhost:8080")
public interface Service1Client {

    @GetMapping("/api/service1/calculate")
    int calculate(@RequestParam int number);

}
