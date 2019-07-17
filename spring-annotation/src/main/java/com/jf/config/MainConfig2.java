package com.jf.config;

import com.jf.bean.Person;
import com.jf.condition.LinuxCondition;
import com.jf.condition.WinCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author 潇潇暮雨
 * @create 2019-07-14   21:32
 */

@Configuration
public class MainConfig2 {

    // @Lazy
    // @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public Person person() {
        return new Person("江峰", 23);
    }


    @Conditional(value = {WinCondition.class})
    @Bean("win")
    public Person person1() {
        return new Person("win", 17);
    }

    // 在加载bean的时候会判断这个条件是否成立。
    @Conditional(value = LinuxCondition.class)
    @Bean("linux")
    public Person person2() {
        return new Person("江峰", 23);
    }


}
