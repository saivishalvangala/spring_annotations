package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
@PropertySource("classpath:property.properties")
public class ConfigClass {
    @Bean
    public Actor actor1(){
        Actor actor =new Actor("prabhas","male",40);
        return actor;

    }

    @Bean
    public Actor actor2(){
        Actor actor =new Actor("prabhas2","male",40);
        return actor;

    }
    @Bean
    public Actor actor3(){
        Actor actor =new Actor("prabhas3","male",40);
        return actor;

    }

    @Bean
    public Movie movie(){
        Movie movie =new Movie(actor2());
        return movie;
    }

    @Bean
    public Movie movie1(){
        Movie movie =new Movie(actor2());
        return movie;
    }
}
