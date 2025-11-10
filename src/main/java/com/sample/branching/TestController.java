package com.sample.branching;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/order/number")
    public String orderNumber() {
        return UUID.randomUUID().toString();
    }
}
