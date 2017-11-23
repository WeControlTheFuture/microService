package com.nemo.product.model.dto;

import java.io.Serializable;

public class ProductData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 996252134293945325L;

	private String code;
	
	private String name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
