package com.jf;

import com.jf.bean.Person;
import com.jf.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void createBeanWithXml() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) ac.getBean("person");
        Person person2 = (Person) ac.getBean("person");
        System.out.println(person == person2);
    }

    @Test
    public void createBeanWithAnnotation() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);

        // Person hello = (Person) ac.getBean("hello");
        // System.out.println(hello);

        // Person person = (Person) ac.getBean("person");
        // Person person2 = (Person) ac.getBean("person");
        // System.out.println(person == person2);
    }

    @Test
    public void testContainsController() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(ac.containsBean("bookController"));
    }

}
