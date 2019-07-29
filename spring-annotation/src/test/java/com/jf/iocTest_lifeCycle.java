package com.jf;

import com.jf.config.BeanLifeCycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 潇潇暮雨
 * @create 2019-07-23   23:00
 */
public class iocTest_lifeCycle {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);

    @Test
    public void fun() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
