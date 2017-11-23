package com.nemo.product.dao;

import java.io.Serializable;

import com.nemo.common.dao.BaseMongoRepository;
import com.nemo.product.model.dao.Product;

public interface ProductDao extends BaseMongoRepository<Product,Serializable>{

}
