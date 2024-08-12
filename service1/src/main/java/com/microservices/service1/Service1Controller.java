package com.microservices.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Service1Controller {
    @GetMapping("/say")
    public String say() {
        return "Hello World from service 111";
    }
}
