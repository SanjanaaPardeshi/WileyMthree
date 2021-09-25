package com.wiley;

import java.util.Scanner;
public class MainSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter no. of elements:");
		  int n=sc.nextInt();
		  int []arr=new int[n];
		  for(int i=0;i<n;i++)
		  {
			  System.out.println("Enter number:");
			  arr[i]=sc.nextInt();
		  }
		  SelectionSort selection=new SelectionSort();
		  selection.selectionSort(arr, n);
		  System.out.print("Sorted elements using Selection Sort are:");
		  selection.display(arr, n);
		  
		  sc.close();
	}

}
