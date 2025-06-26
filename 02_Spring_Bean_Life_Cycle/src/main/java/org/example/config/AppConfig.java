package org.example.config;

import org.example.bean.MyConnection;
import org.example.bean.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = TestBean1.class)

public class AppConfig {
    @Bean
    @Scope("prototype")
    public MyConnection myConnection() {
        return new MyConnection();
    }
}
