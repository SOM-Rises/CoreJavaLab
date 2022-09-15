/*  
Name : Somnath Hazra
3. Write a java program to print the tagline of any 5 companies (Enahnced switch case).
*/

import java.util.Scanner;

class taglineOfCom{
	public static void main(String args[])   
	{ 	
	
	Scanner tagName = new Scanner(System.in);  
    System.out.println("Enter username");
    String tag = tagName.nextLine().toLowerCase(); 
		
		switch(tag)
		
		{
			case "ubisoft" :  System.out.println("we create worlds for everyone.");
							  break;
			case "eagames" : System.out.println("It's in the game");
							  break;
			case "activision" : System.out.println("Great Games Start with Great People.");
							  break;
			case "microsoft" : System.out.println("We believe in what people make possible.");
							  break;
			case "intel" : System.out.println("Intel shapes the future of technology.");
							  break;
			default : System.out.println("Give yourself more time to think about your next move");
		
		
		}
	
	}
}