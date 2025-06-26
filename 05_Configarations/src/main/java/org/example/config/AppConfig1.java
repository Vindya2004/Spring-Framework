package org.example.config;

import org.example.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
    @Bean
    public SpringBeanOne springBeanOne() {
        return new SpringBeanOne();
    }
}
