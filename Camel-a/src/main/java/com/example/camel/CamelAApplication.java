package com.example.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.example.camel.c")
@ComponentScan("com.example.camel.a")
public class CamelAApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamelAApplication.class, args);
    }

}
