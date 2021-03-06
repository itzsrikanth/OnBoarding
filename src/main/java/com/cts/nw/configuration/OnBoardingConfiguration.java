package com.cts.nw.configuration;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.cts.nw")
public class OnBoardingConfiguration {

/*	   *//**
     * Configure ViewResolvers to deliver preferred views.
     *//*
	@Bean
	public InternalResourceViewResolver viewResolver() {
	    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setViewClass(JstlView.class);
	    viewResolver.setPrefix("/");
	    viewResolver.setSuffix(".jsp");
	    return viewResolver;
	}
     */
/*    *//**
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     *//*
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }*/
}