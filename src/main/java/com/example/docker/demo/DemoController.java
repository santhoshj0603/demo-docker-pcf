package com.example.docker.demo;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value("${com.cloud.hello:}")
	public String message;
	
	@GetMapping("/hellodocker")
	@Produces("appplication/json")
	public Message message() {
		Message m = new Message();
		m.setMessage(message);
		return m;
	}

}
