package com.palindrome;

public class MainPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome p = new palindrome();
		p.setNum(121);
		if(p.isStatus()==true)
			System.out.println("The Number is Palindrome.");
		else
			System.out.println("The Number is not a Palindrome.");
	}

}
