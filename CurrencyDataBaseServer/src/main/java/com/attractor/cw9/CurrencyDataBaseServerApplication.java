package com.attractor.cw9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyDataBaseServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyDataBaseServerApplication.class, args);
    }

}
