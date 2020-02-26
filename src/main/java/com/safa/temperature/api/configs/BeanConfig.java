package com.safa.temperature.api.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@Configuration
public class BeanConfig {
	@Bean
	@LoadBalanced
    public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
