package com.turing.sb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:myconfig.properties")
public class Sb2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb2Application.class, args);
    }
}
