package com.jf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author 潇潇暮雨
 * @create 2019-08-26   22:48
 */

//
@ComponentScan(value = "com.jf",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        ),
        useDefaultFilters = false)
public class RootAcConfig {

}
