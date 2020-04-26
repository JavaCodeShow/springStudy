package com.config;

import com.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 潇潇暮雨
 * @create 2019-08-25   21:54
 */

@Configuration
public class BeanConfig {

    @Bean
    public Person person() {
        System.out.println("创建了person对象");
        return new Person();
    }

}
