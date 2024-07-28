package org.example.dependencyinjection;

import org.example.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		/*
		 * Getting a bean from the Spring Application Context
		 */
		System.out.println("\n----------Primary Based----------");
		SpringContextController controller = ctx.getBean(SpringContextController.class);
		System.out.println(controller.sayHello());

		System.out.println("\n----------Property Based----------");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("\n----------Setter Based----------");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("\n----------Constructor Based----------");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("\n----------Profile Based----------");
		I18nController i18nController = ctx.getBean(I18nController.class);
		System.out.println(i18nController.sayHello());
	}

}
