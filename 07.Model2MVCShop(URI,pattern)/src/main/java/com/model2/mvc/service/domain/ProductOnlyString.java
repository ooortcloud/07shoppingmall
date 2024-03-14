package com.model2.mvc.service.domain;

import java.sql.Date;

public class ProductOnlyString {

	private String fileName;
	private String manuDate;
	private String prodDetail;
	private String prodName;
	private String proTranCode;  // 현재 상태
	
	public ProductOnlyString() {
		// TODO Auto-generated constructor stub
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

	public String getProTranCode() {
		return proTranCode;
	}

	public void setProTranCode(String proTranCode) {
		this.proTranCode = proTranCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductOnlyString [fileName=");
		builder.append(fileName);
		builder.append(", manuDate=");
		builder.append(manuDate);
		builder.append(", prodDetail=");
		builder.append(prodDetail);
		builder.append(", prodName=");
		builder.append(prodName);
		builder.append(", proTranCode=");
		builder.append(proTranCode);
		builder.append("]");
		return builder.toString();
	}

	
	
}
