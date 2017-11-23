package com.nemo.client.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nemo.client.service.ProductService;

@RestController
@RequestMapping("/p")
public class ProductController {

	@Resource
	private ProductService productService;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getProduct(@RequestParam String code) {
		return "find product data " + productService.getProduct(code).getCode();
	}
}
