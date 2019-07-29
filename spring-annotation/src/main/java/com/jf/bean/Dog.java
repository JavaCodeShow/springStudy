package com.jf.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author 潇潇暮雨
 * @create 2019-07-23   22:06
 */

public class Dog implements ApplicationContextAware, BeanNameAware {
    private ApplicationContext applicationContext = null;

    public Dog() {
        System.out.println("dog constructor");
    }

    public void init() {
        System.out.println("create dog init ");
    }

    public void destroy() {
        System.out.println("destroy dog ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("name = " + name);
    }
}
