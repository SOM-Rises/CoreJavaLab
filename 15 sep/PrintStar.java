/*
Name : Somnath Hazra
1. Java program to print a pattern 		
			 *
			***
		   *****
*/


import java.util.Scanner;

class PrintStar
{
	static void pattern(int n)
	{
		
		 for(int i = 1;i<=n;i++){
        for(int j = 1;j<=n-i;j++){
            System.out.print(" ");
        }
         for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
         for(int k = 2;k<=i;k++){
           System.out.print("*");
        }
        System.out.println(); 
    }
	}


   public static void main(String args[])
   {
	int num = Integer.parseInt(args[0]);
	pattern(num);
   }
}