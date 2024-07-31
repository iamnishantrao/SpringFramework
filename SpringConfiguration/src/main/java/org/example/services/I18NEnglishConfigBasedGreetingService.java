package org.example.services;

import org.example.repositories.EnglishGreetingRepository;

public class I18NEnglishConfigBasedGreetingService implements ConfigBasedGreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18NEnglishConfigBasedGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
