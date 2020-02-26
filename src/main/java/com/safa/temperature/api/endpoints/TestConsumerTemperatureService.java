package com.safa.temperature.api.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.safa.temperature.api.payload.requests.TemperatureRequest;
import com.safa.temperature.api.payload.responses.TemperatureResponse;
import com.safa.temperature.api.services.TemperatureService;

@RestController()
@RequestMapping("/test")
public class TestConsumerTemperatureService {
	
	@Autowired
	private TemperatureService service ;
	
	@PostMapping("/min")
	public TemperatureResponse testConsumeMin(@RequestBody TemperatureRequest request) {
		return service.consumeMin(request);
	}
	@PostMapping("/max")
	public TemperatureResponse testConsumeMax(@RequestBody TemperatureRequest request) {
		return service.consumeMax(request);
	}

}
