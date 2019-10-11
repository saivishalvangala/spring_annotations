package com.stackroute.config;

import com.stackroute.domain.Actor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute.domain")
public class Config {
    @Bean
    public Actor actor1() {
        Actor actor = new Actor();
        actor.setAge(22);
        actor.setGender("Male");
        actor.setName("vishal");
        return actor;
    }

    @Bean
    public Actor actor2() {
        Actor actor = new Actor("prabhas","Male",15);
        return actor;
    }

    @Bean
    public Actor actor3() {
        Actor actor = new Actor("vishal","Male",30);
        return actor;
    }
}
