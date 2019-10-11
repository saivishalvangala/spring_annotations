package com.stackroute;
import com.stackroute.config.Config;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.stackroute.demo.BeanLifecycleDemoBean;

public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean(BeanLifecycleDemoBean.class);

        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie);

        context.registerShutdownHook();
    }
}

