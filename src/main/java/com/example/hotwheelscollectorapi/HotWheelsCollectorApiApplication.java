package com.example.hotwheelscollectorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HotWheelsCollectorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotWheelsCollectorApiApplication.class, args);
	}
}
