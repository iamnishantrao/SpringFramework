package org.example.services;

public class PrimaryConfigBasedGreetingService implements ConfigBasedGreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World from Primary ConfigBasedGreetingService!";
    }
}
