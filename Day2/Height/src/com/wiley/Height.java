package com.wiley;

public class Height {
	private int feet,inches;
	 public Height(int feet,int inches)
	 {
		 this.feet=feet+inches/12;
		 this.inches=inches%12;
	 }
	 
	 Height(int feet)
	 {
		 this.feet=feet;
		 this.inches=0;
	 }
	 Height()
	 {
		feet=8;
		inches=5;
	 }
	 public void display() {
				    System.out.print(feet+"Ft.");
				    System.out.println(" "+inches+"inches");
				
		}
	 
	 public Height sumFeet(Height h1)
	 {
		 Height h=new Height();
			h.feet=feet+h1.feet;
			h.inches=inches+h1.inches;
			return h;
	 }

}
