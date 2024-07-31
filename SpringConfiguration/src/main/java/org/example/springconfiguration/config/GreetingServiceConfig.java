package org.example.springconfiguration.config;

import org.example.services.ConfigBasedGreetingServiceImpl;
import org.example.services.I18NEnglishConfigBasedGreetingService;
import org.example.services.I18NSpanishConfigBasedGreetingService;
import org.example.services.PrimaryConfigBasedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConfigBasedGreetingServiceImpl configBasedGreetingServiceImpl() {
        return new ConfigBasedGreetingServiceImpl();
    }

    @Bean
    @Primary
    PrimaryConfigBasedGreetingService primaryConfigBasedGreetingService() {
        return new PrimaryConfigBasedGreetingService();
    };

    /*
    By-default Spring will use the method name for the Bean name
     */
    @Bean
    @Profile("EN")
    I18NEnglishConfigBasedGreetingService i18nService() {
        return new I18NEnglishConfigBasedGreetingService();
    }

    /*
    We can also override the Bean name in the @Bean annotation and the method name will not be used
     */
    @Bean("i18nService")
    @Profile({"ES", "default"})
    I18NSpanishConfigBasedGreetingService i18nSpanishService() {
        return new I18NSpanishConfigBasedGreetingService();
    }
}
