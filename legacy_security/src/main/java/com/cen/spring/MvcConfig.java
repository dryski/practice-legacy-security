package com.cen.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer{

	public MvcConfig() {
		super();
	}

	@Bean
	public ViewResolver viewResolver() {
		final InternalResourceViewResolver bean = new InternalResourceViewResolver();
		
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		
		return bean;
	}
	
}