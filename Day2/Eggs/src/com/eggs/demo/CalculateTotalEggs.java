package com.eggs.demo;

public class CalculateTotalEggs {

	private int eggs;

	CalculateTotalEggs(int n){
		eggs = n;
	}
	
	public Eggs Cal() {
		Eggs eg = new Eggs();
		eg.setTotalEggs(eggs);
		
		int gross = (eg.getTotalEggs())/144;
		int dozen =(eg.getDozen())/12;
		int remaining =(eg.getRemaining())%12;
		eg.setGross(gross);
		eg.setDozen(dozen);
		eg.setRemaining(remaining);
		return eg;
	}
	
	
}
