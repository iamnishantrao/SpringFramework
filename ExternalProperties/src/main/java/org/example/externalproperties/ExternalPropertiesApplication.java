package org.example.externalproperties;

import org.example.externalproperties.config.BindPropertiesConfiguration;
import org.example.externalproperties.config.ConstructorBasedConfiguration;
import org.example.externalproperties.datasource.AppDataSource;
import org.example.externalproperties.datasource.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExternalPropertiesApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(ExternalPropertiesApplication.class, args);

        System.out.println("----------Data Source From datasource.properties----------");
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());
        System.out.println(dataSource.getUrl());

        System.out.println("\n----------Data Source From application.properties----------");
        AppDataSource appDataSource = ctx.getBean(AppDataSource.class);
        System.out.println(appDataSource.getUsername());
        System.out.println(appDataSource.getPassword());
        System.out.println(appDataSource.getUrl());

        System.out.println("\n----------Bind Properties Using Configuration----------");
        BindPropertiesConfiguration bindPropertiesConfiguration = ctx.getBean(BindPropertiesConfiguration.class);
        System.out.println(bindPropertiesConfiguration.getUsername());
        System.out.println(bindPropertiesConfiguration.getPassword());
        System.out.println(bindPropertiesConfiguration.getUrl());

        System.out.println("\n----------Bind Properties Using Constructor----------");
        ConstructorBasedConfiguration constructorConfiguration = ctx.getBean(ConstructorBasedConfiguration.class);
        System.out.println(constructorConfiguration.getUsername());
        System.out.println(constructorConfiguration.getPassword());
        System.out.println(constructorConfiguration.getUrl());
    }

}
