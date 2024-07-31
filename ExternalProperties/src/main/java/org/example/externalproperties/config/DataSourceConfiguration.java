package org.example.externalproperties.config;

import org.example.externalproperties.datasource.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfiguration {

    @Bean
    DataSource dataSource(@Value("${username}") String username, @Value("${password}") String password,
                          @Value("${url}") String url) {
        DataSource dataSource = new DataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        return dataSource;
    }
}
