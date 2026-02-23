package com.Prakhar.Modulefirst;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfig {
    @Bean
    Paying paying() {
        return new Paying();
    }
}
