package com.wiley;

public class MainHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Height h=new Height();
		h.display();
		Height h1=new Height(15,24);
		Height h2=new Height(14);
		h1.display();
		h2.display();
		Height sumHeight=h1.sumFeet(h2);
		sumHeight.display();

	}

}
