package com.fastcampus.fastcampusspringpractice.web;

import com.fastcampus.fastcampusspringpractice.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

    /*@Override
    public void onStartup(ServletContext servletContext) {
        // Load Spring web application configuration
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(Config.class);

        // Create and register the DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }*/

    @Override
    public void onStartup(ServletContext servletContext) throws Exception {

    }

    @Override
    public void onStartup(jakarta.servlet.ServletContext servletContext) throws ServletException {

    }
}
