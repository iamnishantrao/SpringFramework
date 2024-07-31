package org.example.externalproperties;

import org.example.externalproperties.datasource.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExternalPropertiesApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(ExternalPropertiesApplication.class, args);

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println("----------Data Source Details----------");
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());
        System.out.println(dataSource.getUrl());
    }

}
