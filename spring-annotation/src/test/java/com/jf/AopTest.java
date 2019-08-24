package com.jf;

import com.jf.bean.SqlRun;
import com.jf.config.AopConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 潇潇暮雨
 * @create 2019-07-29   22:24
 */
public class AopTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AopConfig.class);

    @Test
    public void run() {
        SqlRun sqlRun = (SqlRun) ac.getBean("sqlRun");
        sqlRun.update();
    }
}
