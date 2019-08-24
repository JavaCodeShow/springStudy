package com.jf;

import com.jf.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 潇潇暮雨
 * @create 2019-08-21   21:19
 */
public class ExtTest {

    @Test
    public void fun() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ExtConfig.class);
        ac.close();
    }
}
