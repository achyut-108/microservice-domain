package com.ihs.gsg.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.ihs.gsg")
@EnableAutoConfiguration
public class GetSetGoCoreApplication {

	
	//private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		SpringApplication.run(GetSetGoCoreApplication.class, args);

//		applicationContext = new AnnotationConfigApplicationContext(GetSetGoCoreApplication.class);
//
//		for (String beanName : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(beanName);
//		}	
	}

}
