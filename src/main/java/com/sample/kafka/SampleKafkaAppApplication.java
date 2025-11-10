package com.sample.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SampleKafkaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleKafkaAppApplication.class, args);
    }

}
