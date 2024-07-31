package org.example.springconfiguration.controllers;

import org.example.services.ConfigBasedGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NConfigBasedGreetingController {

    private final ConfigBasedGreetingService configBasedGreetingService;

    public I18NConfigBasedGreetingController(@Qualifier("i18nService") ConfigBasedGreetingService configBasedGreetingService) {
        this.configBasedGreetingService = configBasedGreetingService;
    }

    public String sayGreeting() {
        return configBasedGreetingService.sayGreeting();
    }
}
