package com.eggs.demo;

import java.util.Scanner;
public class MainEgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of eggs: ");
		int numOfEggs = sc.nextInt();
		CalculateTotalEggs eggs =new CalculateTotalEggs(numOfEggs);
		Eggs eg =eggs.Cal();
		System.out.println("Gross: "+eg.getGross()+"Dozen :"+eg.getDozen()+"Remaining Eggs: "+eg.getRemaining());
	}

}
