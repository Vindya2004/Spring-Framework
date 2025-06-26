package org.example.config;

import org.example.bean.Bean_A;
import org.example.bean.Bean_B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
    @Bean
    public Bean_A beanA() {
        return new Bean_A();
    }
    @Bean
    public Bean_B beanB() {
        return new Bean_B();
    }
}
