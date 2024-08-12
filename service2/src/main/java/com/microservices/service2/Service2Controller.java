package com.microservices.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
    @GetMapping("/say")
    public String say() {
        return "Hello World from service 222";
    }
}
