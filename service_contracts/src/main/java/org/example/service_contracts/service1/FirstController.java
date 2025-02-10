package org.example.service_contracts.service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service", url = "${service1.url}")
public interface FirstController {

    @GetMapping("/calculate")
    Integer calculate(@RequestParam Integer number);
}
