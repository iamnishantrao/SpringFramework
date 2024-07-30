package org.example.springconfiguration.config;

import org.example.services.ConfigBasedGreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConfigBasedGreetingServiceImpl configBasedGreetingServiceImpl() {
        return new ConfigBasedGreetingServiceImpl();
    }
}
