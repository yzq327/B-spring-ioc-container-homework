package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingService {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    String sayHi() {
        System.out.println("Prototype Bean created");
        return "hello world";
    }
}
