package com.jf.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author 潇潇暮雨
 * @create 2019-08-26   22:45
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // // Load Spring web application configuration
        // AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        // ac.register(AppConfig.class);
        // ac.refresh();
        //
        // // Create and register the DispatcherServlet
        // DispatcherServlet servlet = new DispatcherServlet(ac);
        // ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
        // registration.setLoadOnStartup(1);
        // registration.addMapping("/*");
    }
}
