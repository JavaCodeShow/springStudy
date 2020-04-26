package com;

import com.bean.Person;
import com.config.BeanConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 潇潇暮雨
 * @create 2019-08-25   21:55
 */
public class BeanTest {

    @Test
    public void hello() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
    }

    @Test
    public void hello1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        // Person person = (Person) ac.getBean("person");
        // System.out.println(person);
    }
}
