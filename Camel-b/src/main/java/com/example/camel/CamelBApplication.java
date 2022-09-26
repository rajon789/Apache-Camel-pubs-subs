package com.example.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.camel.routes")
public class CamelBApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamelBApplication.class, args);
    }

}
