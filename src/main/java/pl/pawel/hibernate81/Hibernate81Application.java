package pl.pawel.hibernate81;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Hibernate81Application {

    public static void main(String[] args) {
        SpringApplication.run(Hibernate81Application.class, args);
    }

}
