/*  
Name : Somnath Hazra
2. Java progam to find whether the character entered is vowel ,consonant ,number and special character.		
*/
class CharecterOrNumber
{
	
	static void vowelOrConsonent(char val)
	{
		if((val>=65)&&(val<=122)){
			
			if((val=='A')||(val=='E')||(val=='I')||(val=='O')||(val=='U'))
			{
				System.out.println("Its a vowel");
			}
			else if((val=='a')||(val=='e')||(val=='i')||(val=='o')||(val=='u'))
			{
				System.out.println("Its a vowel");
			}
			else
			{
				System.out.println("Its a consonant");
			}	
		}

    	else{
			if((val>=48)&&(val<=57))
			{
				System.out.println("Its a number");
			}
			else{
				System.out.println("Its a special character");
			}
			
		
		}
	}	 
		
	
   public static void main(String args[])
   {
	   char value = args[0].charAt(0);
	   //int num = Integer.parseInt(args[0]);
	   //NumberOrNot(num);
	   vowelOrConsonent(value);
    }


}