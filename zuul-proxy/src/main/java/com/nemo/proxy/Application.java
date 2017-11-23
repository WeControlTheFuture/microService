package com.nemo.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.netflix.zuul.ZuulFilter;

@EnableZuulProxy
@SpringCloudApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ZuulFilter gatewayFilter() {
		return new GatewayFilter();
	}
}