package com.model2.mvc.service.domain;

import java.sql.Date;

public class Product {
	
	private String fileName;
	private String manuDate;
	private Integer price;
	private String prodDetail;
	private String prodName;
	private Integer prodNo;
	private Date regDate;
	private String proTranCode;  // ���� ����

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(ProductOnlyString product) {
		this.fileName = product.getFileName();
		this.manuDate = product.getManuDate();
		this.prodDetail = product.getProdDetail();
		this.prodName = product.getProdName();
		this.proTranCode = product.getProTranCode();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getManuDate() {
		return manuDate;
	}

	public void setManuDate(String manuDate) {
		this.manuDate = manuDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProdDetail() {
		return prodDetail;
	}

	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdNo() {
		return prodNo;
	}

	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getProTranCode() {
		return proTranCode;
	}

	public void setProTranCode(String proTranCode) {
		this.proTranCode = proTranCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [fileName=");
		builder.append(fileName);
		builder.append(", manuDate=");
		builder.append(manuDate);
		builder.append(", price=");
		builder.append(price);
		builder.append(", prodDetail=");
		builder.append(prodDetail);
		builder.append(", prodName=");
		builder.append(prodName);
		builder.append(", prodNo=");
		builder.append(prodNo);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", proTranCode=");
		builder.append(proTranCode);
		builder.append("]");
		return builder.toString();
	}
	
	

}
