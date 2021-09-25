package com.wiley;

import java.util.Scanner;

public class MainBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter the elements in array: ");
		for(int i =0; i<n;i++)
			arr[i]= sc.nextInt();
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(n,arr);
		System.out.println("Sorted Array :");
		bs.display(n, arr);
		sc.close();
	}

}
