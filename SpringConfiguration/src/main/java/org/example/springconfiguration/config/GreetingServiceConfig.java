package org.example.springconfiguration.config;

import org.example.pets.PetService;
import org.example.pets.PetServiceFactory;
import org.example.repositories.EnglishGreetingRepository;
import org.example.repositories.EnglishGreetingRepositoryImpl;
import org.example.services.*;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:xml-config.xml")
public class GreetingServiceConfig {

    @Bean
    ConfigBasedGreetingService configBasedGreetingServiceImpl() {
        return new ConfigBasedGreetingServiceImpl();
    }

    @Bean
    @Primary
    ConfigBasedGreetingService primaryConfigBasedGreetingService() {
        return new PrimaryConfigBasedGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    /*
    By-default Spring will use the method name for the Bean name
    We can also inject dependencies here in configuration at the time of registering Beans
     */
    @Bean
    @Profile("EN")
    ConfigBasedGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18NEnglishConfigBasedGreetingService(englishGreetingRepository);
    }

    /*
    We can also override the Bean name in the @Bean annotation and the method name will not be used
     */
    @Bean("i18nService")
    @Profile({"ES", "default"})
    ConfigBasedGreetingService i18nSpanishService() {
        return new I18NSpanishConfigBasedGreetingService();
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Bean
    @Profile("cat")
    PetService petService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    @Profile({"dog", "default"})
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }
}
