package com.nemo.price.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nemo.price.model.dto.PriceData;
import com.nemo.price.service.PriceService;

@RefreshScope
@RestController
public class PriceServiceImpl implements PriceService {

	@Value("${redis.master.addresses:abc}")
	private String redisMaster;

	@Value("${db.url:abc}")
	private String dbUrl;

	@Override
	public PriceData getPrice() {
		return null;
	}

	@RequestMapping("/getRedisMaster")
	public String getMyRedisMaster() {
		return redisMaster;
	}

	@RequestMapping("/getDburl")
	public String getDburl() {
		return dbUrl;
	}
}
