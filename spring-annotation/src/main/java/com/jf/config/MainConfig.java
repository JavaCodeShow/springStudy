package com.jf.config;

import com.jf.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * @author 潇潇暮雨
 * @create 2019-07-13   17:07
 */

// 表明这是spring的一个配置类
@Configuration
@ComponentScan(value = "com.jf", excludeFilters = {
        @ComponentScan.Filter(classes = {
                Controller.class
        })
}) // 包扫描
public class MainConfig {

    @Bean
    public Person person() {
        return new Person("林加铭", 22);
    }
}
