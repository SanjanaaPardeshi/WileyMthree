package com.wiley;

public class BubbleSort {
	public void bubbleSort(int n, int [] arr) {
		 int i,j,temp;
		   boolean swapped=false;
		   for(i=0;i<n-1;i++)
		   {
			   for(j=0;j<n-i-1;j++)
			   {
				   if(arr[j]>arr[j+1])
				   {
					   temp=arr[j];
					   arr[j]=arr[j+1];
					   arr[j+1]=temp;
					   swapped=true;
				   }
			   }
			   if(swapped==false)
				   break;
		   }   
	}
	
	public void display(int n, int [] arr) {
		for(int i=0;i<arr.length;i++)
		    System.out.print(arr[i]+" ");
	}

}
