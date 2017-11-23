package com.nemo.client.model;

import java.io.Serializable;

public class ProductData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 996252134293945325L;

	private String code;

	private int age;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
