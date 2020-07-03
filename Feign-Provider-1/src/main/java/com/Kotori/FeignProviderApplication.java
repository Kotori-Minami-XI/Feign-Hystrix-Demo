package com.Kotori;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.Kotori")
@EnableCircuitBreaker
public class FeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignProviderApplication.class);
    }
}
