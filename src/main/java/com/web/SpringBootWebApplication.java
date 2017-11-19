package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.core.SpringBootCoreApplication;
import com.core.application.config.CoreCofig;
import com.web.application.config.WebConfig;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootWebApplication.class, args);
		new SpringApplicationBuilder(SpringBootCoreApplication.class)
		.child(SpringBootWebApplication.class).run(args);
	}
}
