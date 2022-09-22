/*
LAB TEST
Program : 1. Write a Java program to print the duplicate entries , Sort the array and then remove the duplicate entry.		
name : somnath Hazra
@date : 22th sept,2022
*/

import java.util.Scanner;
import java.util.Arrays;

class EmitMultipleElm
{
	static void inputArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int rows= sc.nextInt();
		
		int arr[]= new int[rows];
		
		System.out.println("Enter the values:");
		
		for(int i=0;i<rows;i++)
		{	
	     	arr[i]= sc.nextInt();
		}
		
		 // sorting the elements	
	      int n= arr.length;
		   for(int i = 0;i<n-1;i++){
			   for(int j = 0;j<n-i-1;j++){
				   if(arr[j] > arr[j+1]){
					  int temp = arr[j] ;
					  arr[j] = arr[j+1];
					  arr[j+1] = temp; 
					   
				   }
				   
			   }
			   
		   }	   

		System.out.println();
		
		System.out.println("Array values after sorting");
        display(arr);
		
		System.out.println();
		
		System.out.println("After removing Duplicate Occurence...");
        emitDuplicate(arr);
		
	}
	
	static void display(int myArray[])
	{
		
		System.out.println();
	
		for(int myrow:myArray)
		{
		 System.out.print(myrow+ "  ");		
		}
		
	}
	
	
	
   
   static void emitDuplicate(int myArray[])
   {
	   int size= myArray.length;
	   int new_size;
	   if(size==0||size==1)
	   {
		   new_size=size;
	   }
	   int temp[] = new int[size];
	   int j=0;
	   for(int i=0;i<size-1;i++)
	   {
		   if(myArray[i] != myArray[i+1])
		   {
			   temp[j++] = myArray[i];
		   }
	   }
	   temp[j++]=myArray[size-1];
	   
	   //changing original array
	   for(int i=0; i<j;i++)
	   {
		   myArray[i]= temp[i];
	   }
	   
	   //printing after removing duplicate entries
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(myArray[i]+"  ");
	   }
   }

   public static void main(String args[])
   {
    inputArray();
   }

}