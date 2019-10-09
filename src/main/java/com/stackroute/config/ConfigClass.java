package com.stackroute.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.stackroute.domain"})
@PropertySource("classpath:property.properties")
public class ConfigClass {


}
