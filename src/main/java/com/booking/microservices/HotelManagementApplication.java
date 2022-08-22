package com.booking.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration  // Sprint Boot Auto Configuration
@ComponentScan(basePackages = "com.booking.microservices")
@EnableJpaRepositories("com.booking.microservices.jpa") 
// It is equivalent to using @Configuration,
// @EnableAutoConfiguration and @ComponentScan with their
// default attributes:
public class HotelManagementApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(
			HotelManagementApplication.class,
			args);
	}
}
