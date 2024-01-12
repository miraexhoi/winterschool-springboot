package com.mysite.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.mysite.springboot.entity")
public class WinterschoolSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(WinterschoolSpringbootApplication.class, args);
    }
}
