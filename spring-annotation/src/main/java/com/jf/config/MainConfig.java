package com.jf.config;

import com.jf.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 潇潇暮雨
 * @create 2019-07-13   17:07
 */

@Configuration
public class MainConfig {

    @Bean(name = "hello")
    public Person person() {
        return new Person("林加铭", 22);
    }
}
