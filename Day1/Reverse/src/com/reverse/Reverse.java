package com.reverse;

public class Reverse {

	private int num, rev=0;

	public void setNum(int number) {
		this.num = number;
	}

	public int getRev() {
		reverseNumber();
		return rev;
	}	
	
	public void reverseNumber() {
		int reminder;
		while(num != 0) {
			reminder = num % 10;
			rev = rev * 10 + reminder;
			num = num/10;
		}
	}
}
