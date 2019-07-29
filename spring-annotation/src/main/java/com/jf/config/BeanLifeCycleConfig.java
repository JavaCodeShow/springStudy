package com.jf.config;

import com.jf.bean.Dog;
import com.jf.condition.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 潇潇暮雨
 * @create 2019-07-23   23:01
 */

@Configuration
public class BeanLifeCycleConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}

