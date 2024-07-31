package org.example.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World in English from I18NEnglishConfigBasedGreetingService -> EnglishGreetingRepositoryImpl!";
    }
}
