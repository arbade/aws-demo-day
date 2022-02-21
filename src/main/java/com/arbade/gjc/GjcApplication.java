package com.arbade.gjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class GjcApplication {

    public static void main(String[] args) {
        SpringApplication.run(GjcApplication.class, args);
    }

}
