package com.nemo.product.service;

import com.nemo.product.model.dto.ProductData;
import com.nemo.product.model.dto.ProductReferenceData;

public interface ProductService {

	public ProductData getProductForCode(String productCode);

	public ProductReferenceData getProductReferenceData(String productCode);
}
