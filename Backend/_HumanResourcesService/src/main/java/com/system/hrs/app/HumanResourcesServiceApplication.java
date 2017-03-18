package com.system.hrs.app;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class HumanResourcesServiceApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HumanResourcesServiceApplication.class, args);
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		Arrays.stream(beanNames).forEach(System.out::println);
	}

}
