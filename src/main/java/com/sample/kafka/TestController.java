package com.sample.kafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/order/number")
    public String orderNumber() {
        UUID uuid = UUID.randomUUID();
        System.out.println("order number is: "+ uuid.toString());
        return uuid.toString();
    }
}

