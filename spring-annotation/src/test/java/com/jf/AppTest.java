package com.jf;

import com.jf.bean.Dog;
import com.jf.bean.Person;
import com.jf.condition.DogFactoryBean;
import com.jf.config.MainConfig;
import com.jf.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    // 通过配置类的注解来启动Spring容器
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void hello() throws Exception {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        // factoryBean实际返回的就是一个dog，需要拿到dogFactoryBean的话需要在前面加上&。
        Object dog = ac.getBean("dogFactoryBean");
        DogFactoryBean dogFactoryBean = (DogFactoryBean) ac.getBean("&dogFactoryBean");

        Dog dog1 = dogFactoryBean.getObject();
        Dog dog2 = dogFactoryBean.getObject();
        System.out.println(dog1 == dog2);

    }

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
    public void testContainsControllerWithXml() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(ac.containsBean("bookController"));
    }

    @Test
    public void testContainsControllerWithAnnotation() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(ac.containsBean("bookController"));
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void testScope() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("ioc容器创建完成");
        Person person = (Person) ac.getBean("person");
        Person person2 = (Person) ac.getBean("person");
        System.out.println(person == person2);

    }

    @Test
    public void testCondition() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }


}
