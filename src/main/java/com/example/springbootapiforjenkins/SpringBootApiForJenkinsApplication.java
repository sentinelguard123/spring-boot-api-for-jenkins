package com.example.springbootapiforjenkins;

import com.example.springbootapiforjenkins.entities.ThemeParkRide;
import com.example.springbootapiforjenkins.repositories.ThemeParkRideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.context.Theme;

// Comment here
@SpringBootApplication
public class SpringBootApiForJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApiForJenkinsApplication.class, args);
    }

    @Bean
    public CommandLineRunner sampleData(ThemeParkRideRepository themeParkRideRepository) {
        return (args) -> {
            themeParkRideRepository.save(new ThemeParkRide("Rollercoaster", "Train ride that speeds you along", 5, 3));
            themeParkRideRepository.save(new ThemeParkRide("Log flume", "Boat ride with plenty of splashes", 3, 2));
            themeParkRideRepository.save(new ThemeParkRide("Teacups", "Spinnin ride in a giant tea-cup", 2, 4));
        };
    }
}
