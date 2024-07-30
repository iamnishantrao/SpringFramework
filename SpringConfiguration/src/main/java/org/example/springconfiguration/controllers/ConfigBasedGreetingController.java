package org.example.springconfiguration.controllers;

import org.example.services.ConfigBasedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConfigBasedGreetingController {

    private final ConfigBasedGreetingService configBasedGreetingService;

    @Autowired
    public ConfigBasedGreetingController(ConfigBasedGreetingService configBasedGreetingService) {
        this.configBasedGreetingService = configBasedGreetingService;
    }

    public String getGreeting() {
        return configBasedGreetingService.sayGreeting();
    }
}
