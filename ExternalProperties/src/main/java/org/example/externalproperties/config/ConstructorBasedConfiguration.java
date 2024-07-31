package org.example.externalproperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("constructor")
public class ConstructorBasedConfiguration {

    private final String username;
    private final String password;
    private final String url;

    public ConstructorBasedConfiguration(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
