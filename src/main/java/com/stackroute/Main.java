package com.stackroute;

import com.stackroute.config.ConfigClass;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

//@ComponentScan(basePackages = "com.stackroute.domain")
public class Main {


    public static void main(String[] args) {
//        ClassPathResource res = new ClassPathResource("beans.xml");
//        BeanFactory factory = new XmlBeanFactory(res);
//        Movie movie1=(Movie)factory.getBean("movie");
//        movie1.display();


        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
        Movie movie=context.getBean("movie1", Movie.class);
        movie.display();


    }
}
