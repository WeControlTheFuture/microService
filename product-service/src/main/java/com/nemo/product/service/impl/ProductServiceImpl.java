package com.nemo.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nemo.product.dao.ProductDao;
import com.nemo.product.model.dto.ProductData;
import com.nemo.product.model.dto.ProductReferenceData;
import com.nemo.product.service.ProductService;

@RefreshScope
@RestController
@RequestMapping("/p")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Value("${redis.master.addresses:abc}")
	private String redisMaster;
	
	@Value("${db.url:abc}")
	private String dbUrl;

	@RequestMapping("/getProduct")
	public ProductData getProductForCode(String productCode) {
		//productDao.findAll();
		ProductData productData= new ProductData();
		productData.setCode("bixy");
		productData.setName("what");
		return productData;
	}
	
	@RequestMapping("/getRedisMaster")
	public String getMyRedisMaster(){
		return redisMaster;
	}
	
	@RequestMapping("/getDburl")
	public String getDburl(){
		return dbUrl;
	}

	public ProductReferenceData getProductReferenceData(String productCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
