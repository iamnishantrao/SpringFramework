package org.example.springconfiguration;

import org.example.springconfiguration.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.example.springconfiguration", "org.example.services"})
@SpringBootApplication
public class SpringConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigurationApplication.class, args);
    }

}
