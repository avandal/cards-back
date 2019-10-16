package com.avandal.cards.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Properties;

@Configuration
@PropertySource("classpath:jwt.properties")
public class JwtConfig {
    private final String key = "secret.key";
    private final String time = "expired.time";

    @Autowired
    private Environment env;

    @Bean
    public Properties jwtProperties() {
        Properties properties = new Properties();
        properties.put(key, env.getProperty(key));
        properties.put(time, env.getProperty(time));

        return properties;
    }
}
