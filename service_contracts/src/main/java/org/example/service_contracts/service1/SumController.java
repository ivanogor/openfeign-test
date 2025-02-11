package org.example.service_contracts.service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service1", url = "${service1.url}")
public interface SumController {

    @GetMapping("/calculate")
    Integer sum(@RequestParam Integer firstArgument, @RequestParam Integer secondArgument);
}
