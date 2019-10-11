package com.stackroute;
import com.stackroute.config.Config;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        ClassPathResource res = new ClassPathResource("beans.xml");
//        BeanFactory factory = new XmlBeanFactory(res);
//        Movie movie1=(Movie)factory.getBean("movie");
//        movie1.display();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Movie movie = context.getBean("movie",Movie.class);
        System.out.println(movie);


    }
}
