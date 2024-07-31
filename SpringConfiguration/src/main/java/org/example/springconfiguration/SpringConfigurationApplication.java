package org.example.springconfiguration;

import org.example.services.PrototypeBean;
import org.example.services.SingletonBean;
import org.example.springconfiguration.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.example.springconfiguration", "org.example.services"})
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

        PetController petController = ctx.getBean(PetController.class);
        System.out.println("\n----------Pet Controller----------");
        System.out.println(petController.getCurrentPet());

        XmlConfigBasedGreetingController xmlConfigBasedGreetingController = ctx.getBean(XmlConfigBasedGreetingController.class);
        System.out.println("\n----------Xml Config Based Greeting----------");
        System.out.println(xmlConfigBasedGreetingController.getGreeting());


        System.out.println("\n----------Singleton Bean----------");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());

        System.out.println("\n----------Prototype Bean----------");
        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());
    }

}
