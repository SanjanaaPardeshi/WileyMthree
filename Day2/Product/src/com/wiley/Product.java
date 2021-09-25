package com.wiley;

public class Product {
	
	private int productNumber;
	private int quantitySold;
	
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	
	double retailPrice;
	public void calculate() {
		
		switch(productNumber) {
			case 1: retailPrice = 22.50;
					break;
			case 2: retailPrice = 44.50;
					break;
			case 3: retailPrice = 9.98;
					break;
		}
	}
	public void display() {
		calculate();
		System.out.println("Total retail value : " + quantitySold * retailPrice);
	}

}
