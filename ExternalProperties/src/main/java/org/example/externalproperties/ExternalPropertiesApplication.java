package org.example.externalproperties;

import org.example.externalproperties.datasource.AppDataSource;
import org.example.externalproperties.datasource.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExternalPropertiesApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(ExternalPropertiesApplication.class, args);

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println("----------Data Source From datasource.properties----------");
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());
        System.out.println(dataSource.getUrl());

        AppDataSource appDataSource = ctx.getBean(AppDataSource.class);
        System.out.println("\n----------Data Source From application.properties----------");
        System.out.println(appDataSource.getUsername());
        System.out.println(appDataSource.getPassword());
        System.out.println(appDataSource.getUrl());
    }

}
