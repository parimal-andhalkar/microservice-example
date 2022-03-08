package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	// *************Without Timeout **********************//
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	// *************With Timeout **********************//
	// Timeout solves problem partly. as it releases thread after timeout. request
	// may come faster
	// than timeout period

	/*
	 * @Bean
	 * 
	 * @LoadBalanced public RestTemplate getRestTemplateWithTimeOut() {
	 * HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new
	 * HttpComponentsClientHttpRequestFactory();
	 * clientHttpRequestFactory.setConnectTimeout(3000); return new
	 * RestTemplate(clientHttpRequestFactory); }
	 */
}
