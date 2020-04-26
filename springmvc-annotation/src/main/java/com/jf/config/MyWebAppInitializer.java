package com.jf.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author 潇潇暮雨
 * @create 2019-08-27   21:37
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootAcConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class<?>[]{WebMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {

        // 拦截所有请求
        return new String[]{"/*"};
    }
}
