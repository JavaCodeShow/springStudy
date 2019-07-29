package com.jf;

import com.jf.bean.Person;
import com.jf.config.MainConfigPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 潇潇暮雨
 * @create 2019-07-24   21:40
 */
public class Property_test {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfigPropertyValue.class);

    @Test
    public void fun() {
        Person person = (Person) ac.getBean("person");
        System.out.println("name = " + person.getName());
    }
}
