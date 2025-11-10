package com.sample.branching;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/order/number")
    public String orderNumber() {
        return UUID.randomUUID().toString();
    }

    @DeleteMapping("/order/number/{orderNumber}")
    public String orderNumber(@PathVariable String orderNumber) {
        return orderNumber;
    }
}
