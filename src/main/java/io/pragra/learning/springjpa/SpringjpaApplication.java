package io.pragra.learning.springjpa;

import io.pragra.learning.springjpa.domain.entities.Appointment;
import io.pragra.learning.springjpa.repo.ApptRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

@SpringBootApplication
public class SpringjpaApplication {

    private ApptRepo repo;

    public SpringjpaApplication(ApptRepo repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
       SpringApplication.run(SpringjpaApplication.class, args);
    }


    CommandLineRunner runner() {
        return args -> {
            Appointment appointment
                    = Appointment.builder()
                    .firstName("Gaurav")
                    .lastName("Puri")
                    .appointmentDate(Instant.now().plus(Duration.ofDays(2)))
                    .createDate(Instant.now())
                    .updateUpdate(Instant.now())
                    .doctorName("Vivek")
                    .build();
            repo.save(appointment);
        };
    }

}
