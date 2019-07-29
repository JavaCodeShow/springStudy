package com.jf.config;

import com.jf.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 潇潇暮雨
 * @create 2019-07-24   21:37
 */

@PropertySource(value = {"classpath:/hello.properties"})
@Configuration
public class MainConfigPropertyValue {

    @Bean
    public Person person() {
        return new Person();
    }
}
