package com.example.poc_manta_rest_api;

import org.springframework.boot.SpringApplication;

public class TestPocMantaRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(PocMantaRestApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
