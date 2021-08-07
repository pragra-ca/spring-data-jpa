package io.pragra.learning.springjpa;

import io.pragra.learning.springjpa.repo.ApptRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjpaApplication {

    private final ApptRepo repo;

    public SpringjpaApplication(ApptRepo repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
       SpringApplication.run(SpringjpaApplication.class, args);
    }


    CommandLineRunner runner() {
        return args -> {

        };
    }

}
