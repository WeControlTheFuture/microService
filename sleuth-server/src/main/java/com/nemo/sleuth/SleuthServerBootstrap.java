package com.nemo.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
@EnableEurekaClient
public class SleuthServerBootstrap {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SleuthServerBootstrap.class, args);
	}

}
