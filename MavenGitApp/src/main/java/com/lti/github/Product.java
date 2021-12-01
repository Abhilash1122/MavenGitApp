package com.lti.github;

public class Product {
	private int prdId;
	private String prdName;
	
	public Product(int prdId, String prdName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + "]";
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	

}
