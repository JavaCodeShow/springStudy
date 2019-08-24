package com.jf.ext;

import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

/**
 * @author 潇潇暮雨
 * @create 2019-08-21   21:13
 */

@ComponentScan("com.jf.ext")
public class ExtConfig {
    @PostConstruct
    public void init() {
        System.out.println("init");
    }
    // @Bean
    // public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor() {
    //     return new MyBeanFactoryPostProcessor();
    // }
}
