package com.ihs.gsg.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.ihs.gsg")
@EnableJpaRepositories(basePackages = {"com.ihs.gsg.repo"})
@EnableTransactionManagement
@EntityScan(basePackages = {"com.ihs.gsg"})
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
