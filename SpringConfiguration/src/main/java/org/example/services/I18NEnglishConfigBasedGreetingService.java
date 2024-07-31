package org.example.services;

public class I18NEnglishConfigBasedGreetingService implements ConfigBasedGreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World in English from I18NEnglishConfigBasedGreetingService!";
    }
}
