package com.ihs.gsg.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ihs.gsg"})
@ComponentScan("com.ihs.gsg.*")
public class GetSetGoCompositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetSetGoCompositeApplication.class, args);
	}

}
