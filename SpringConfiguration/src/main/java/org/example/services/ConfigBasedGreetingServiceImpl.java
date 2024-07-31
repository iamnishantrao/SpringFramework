package org.example.services;

public class ConfigBasedGreetingServiceImpl implements ConfigBasedGreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World from ConfigGreetingService!";
    }
}
