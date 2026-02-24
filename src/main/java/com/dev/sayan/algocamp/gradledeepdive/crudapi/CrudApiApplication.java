package com.dev.sayan.algocamp.gradledeepdive.crudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration
public class CrudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApiApplication.class, args);
    }

}
