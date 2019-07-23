package com.jf.config;

import com.jf.bean.Color;
import com.jf.bean.Person;
import com.jf.condition.DogFactoryBean;
import com.jf.condition.MyImportBeanDefinitionRegistrar;
import com.jf.condition.MyImportSelector;
import org.springframework.context.annotation.*;

/**
 * @author 潇潇暮雨
 * @create 2019-07-13   17:07
 */

// 表明这是spring的一个配置类
@Configuration
// 对该路径下面的组件进行扫描注入到ioc容器中。
@ComponentScan(value = "com.jf", excludeFilters = {
        // @ComponentScan.Filter(classes = {Controller.class})
        // 按照类的类型进行过滤，这里过滤掉的是Object类型的所有的类。
        // @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = Object.class)})
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)
})


@Import(value = {Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
// 包扫描

public class MainConfig {

    @Bean
    public Person person() {
        return new Person("林加铭", 22);
    }


    @Bean
    public DogFactoryBean dogFactoryBean() {
        return new DogFactoryBean();
    }
}
