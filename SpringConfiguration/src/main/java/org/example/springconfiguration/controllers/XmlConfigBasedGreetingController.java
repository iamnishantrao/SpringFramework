package org.example.springconfiguration.controllers;

import org.example.services.XmlConfigBasedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class XmlConfigBasedGreetingController {

    private final XmlConfigBasedGreetingService xmlConfigBasedGreetingService;

    @Autowired
    public XmlConfigBasedGreetingController(XmlConfigBasedGreetingService xmlConfigBasedGreetingService) {
        this.xmlConfigBasedGreetingService = xmlConfigBasedGreetingService;
    }

    public String getGreeting() {
        return xmlConfigBasedGreetingService.sayGreeting();
    }
}
