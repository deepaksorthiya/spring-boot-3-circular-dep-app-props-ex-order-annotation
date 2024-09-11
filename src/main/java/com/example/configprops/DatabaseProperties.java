package com.example.configprops;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "database")
public record DatabaseProperties(String host, String port, String username, String password) {
}
