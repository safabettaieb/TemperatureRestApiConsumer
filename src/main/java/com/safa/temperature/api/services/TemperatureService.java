package com.safa.temperature.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.safa.temperature.api.payload.requests.TemperatureRequest;
import com.safa.temperature.api.payload.responses.TemperatureResponse;

@Service
public class TemperatureService {

	
	private final String URL = "http://localhost:8081/api/temperatures" ;
	@Autowired
	private RestTemplate restTemplate ; 
	
	public TemperatureResponse consumeMin(TemperatureRequest request) {
		TemperatureResponse response = restTemplate.postForObject(URL+"/min", request, TemperatureResponse.class);
		return response;	
		
	}
	public TemperatureResponse consumeMax(TemperatureRequest request) {
		TemperatureResponse response = restTemplate.postForObject(URL+"/max", request, TemperatureResponse.class);
		return response;	
		
	}
	public TemperatureResponse consumeAvg(TemperatureRequest requestAvg) {
		TemperatureResponse response = restTemplate.postForObject(URL+"/avg", requestAvg, TemperatureResponse.class);
		return response;	
		
	}
}
