package com.user.pojo;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Employee {

	private Data data;
	private Support support;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}

	@Override
	public String toString() {
		return "Employee [data=" + data + ", support=" + support + "]";
	}
	
	

}