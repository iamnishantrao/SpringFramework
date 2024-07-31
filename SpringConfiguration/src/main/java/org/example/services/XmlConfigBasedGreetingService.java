package org.example.services;

public class XmlConfigBasedGreetingService implements ConfigBasedGreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world from XmlConfigBasedGreetingService!";
    }
}
