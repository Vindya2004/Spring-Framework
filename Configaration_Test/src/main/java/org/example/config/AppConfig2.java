package org.example.config;

import org.example.bean.Bean_C;
import org.example.bean.Bean_D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public Bean_C beanC() {
        return new Bean_C();
    }
    @Bean
    public Bean_D beanD() {
        return new Bean_D();
    }
}
