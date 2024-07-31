package org.example.springconfiguration;

import org.example.springconfiguration.controllers.ConfigBasedGreetingController;
import org.example.springconfiguration.controllers.GreetingController;
import org.example.springconfiguration.controllers.I18NConfigBasedGreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.example.springconfiguration", "org.example.services"})
@SpringBootApplication
public class SpringConfigurationApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringConfigurationApplication.class, args);

        GreetingController greetingController = ctx.getBean(GreetingController.class);
        System.out.println("----------Greeting Controller----------");
        System.out.println(greetingController.getGreeting());

        ConfigBasedGreetingController configBasedGreetingController = ctx.getBean(ConfigBasedGreetingController.class);
        System.out.println("\n----------Config Based Greeting----------");
        System.out.println(configBasedGreetingController.getGreeting());

        I18NConfigBasedGreetingController i18nGreetingController = ctx.getBean(I18NConfigBasedGreetingController.class);
        System.out.println("\n----------I18N Config Based Greeting----------");
        System.out.println(i18nGreetingController.sayGreeting());
    }

}
