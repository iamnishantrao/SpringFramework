package org.example.dependencyinjection;

import org.example.dependencyinjection.controllers.SpringContextController;
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
		SpringContextController controller = ctx.getBean(SpringContextController.class);
		System.out.println(controller.sayHello());
	}

}
