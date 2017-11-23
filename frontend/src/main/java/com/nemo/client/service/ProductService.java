package com.nemo.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nemo.client.model.ProductData;

@FeignClient(value = "EurekaService", fallback = ProductService.HystrixCalculatorService.class)
public interface ProductService {

	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public ProductData getProduct(String productCode);

	/**
	 * 这里采用和SpringCloud官方文档相同的做法，把fallback类作为内部类放入Feign接口中
	 * http://cloud.spring.io/spring-cloud-static/Camden.SR6/#spring-cloud-feign-hystrix
	 * （也可以外面独立定义该类，个人觉得没必要，这种东西写成内部类最合适）
	 */
	@Component
	class HystrixCalculatorService implements ProductService {

		public ProductData getProduct(String productCode) {
			return null;
		}
	}
}
