package com.wiley;

import java.util.Scanner;
public class MainProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Number : ");
		int productNumber = sc.nextInt();
		System.out.println("Enter Quantity : ");
		int quantitySold = sc.nextInt();
		
		Product product = new Product();
		product.setProductNumber(productNumber);
		product.setQuantitySold(quantitySold);
		
		product.display();
		sc.close();
	}
}
