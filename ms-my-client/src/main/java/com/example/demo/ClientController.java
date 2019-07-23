package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@RestController
//@RequestMapping("/rest/client")
public class ClientController {
	@Autowired //looks for bean
	private RestTemplate restTemplate;

	@GetMapping("/demo")
	public String invoke() {
		return "JUST FOR DEMO";
	}
	@HystrixCommand(fallbackMethod = "errorMethod")
//	@GetMapping("/callservice")
	@RequestMapping
	public String invokeService()
	{
		String urlString = "http://My-Service:8091";
		return restTemplate.getForObject(urlString, String.class);
	}
	public String errorMethod()
	{
		return "<h1>Sorry Service is down!! Please try later :(</h1>";
		//can also redirect to another service
	//String urlString = "http://Your-Service:8099";
	//return restTemplate.getForObject(urlString, String.class);
	}
}
