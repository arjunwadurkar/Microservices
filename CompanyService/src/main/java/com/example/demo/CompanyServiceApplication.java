package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@EnableEurekaClient
public class CompanyServiceApplication {

	@Bean
	public RestTemplate restTempalate()
	{
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}

}
