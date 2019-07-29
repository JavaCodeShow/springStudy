package com.jf;

import com.alibaba.druid.pool.DruidDataSource;
import com.jf.config.MainConfigProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * @author 潇潇暮雨
 * @create 2019-07-28   15:48
 */
public class ProfileTest {

    private static int count = 0;

    @Test
    public void fun() throws SQLException {
        // AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfigProfile.class);
        // DruidDataSource dataSource = (DruidDataSource) ac.getBean("dataSource");
        // DruidPooledConnection connection = dataSource.getConnection();
        // Statement statement = connection.createStatement();
        // String sql = "insert into product (name,password) value ('jf1','123')";
        // boolean execute = statement.execute(sql);
        // System.out.println("execute = " + execute);
        // connection.close();


        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.getEnvironment().addActiveProfile("dev");
        ac.register(MainConfigProfile.class);
        ac.refresh();
        String[] beanNamesForType = ac.getBeanNamesForType(DruidDataSource.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

    }


    @Test
    public void hello() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            if (System.currentTimeMillis() - start == 1000) {
                System.out.println(i);
            }
        }
    }
}
