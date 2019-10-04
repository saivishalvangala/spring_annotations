package com.stackroute;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        ClassPathResource res = new ClassPathResource("beans.xml");
//        BeanFactory factory = new XmlBeanFactory(res);
//        Movie movie1=(Movie)factory.getBean("movie");
//        movie1.display();


        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        movie.display();

        Movie movie1=context.getBean("movie1",Movie.class);
        movie1.display();

        if(movie1==movie){
            System.out.println("movie==movie1");
        }
        else
        {
            System.out.println("movie!=movie1");
        }



    }
}
