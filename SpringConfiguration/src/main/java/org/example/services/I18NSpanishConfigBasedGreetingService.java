package org.example.services;

public class I18NSpanishConfigBasedGreetingService implements ConfigBasedGreetingService {

    @Override
    public String sayGreeting() {
        return "Hola World in Spanish from I18NEnglishConfigBasedGreetingService!";
    }
}
