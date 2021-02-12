package com.RestApiTest.RestApiTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiTestApplication.class, args);
	}

}
