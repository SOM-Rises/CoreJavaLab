/*
LAB TEST
3. Write a  java program to create a BankAccount and display the people with balance less than 1000.
name : somnath Hazra
@date : 22th sept,2022
*/
import java.util.Scanner;


// Creating a class named BankAccount
class BankAccount{
	// properties of a account 
	private int accId;
	private String Name;
	private double accBalance;
	
	// no argument constructor
	BankAccount(){}
	
	// parameterized constructor
	BankAccount(int accId,String Name, double accBalance){
	//inttializing the variables
		this.accId=accId;
		this.Name=Name;
		this.accBalance=accBalance;
	}
	
	
	public int getAccId(){
		
		return accId;
	}
	
	
	public void setAccId(){
		
		this.accId=accId;
	}
	
	
	public String getName(){
		
		return Name;
	}
	
	
	public void setName(){
		
		this.Name=Name;
	}
	

	public double getAccBalance(){
		
		return accBalance;
	}
	
	
	public void setAccBalance(){
		
		this.accBalance=accBalance;
	}
}

// Creating BankDetails class
class BankDetails{
	// calling main method
	public static void main(String...args){
		// Creating an array of accounts
		BankAccount bankdetail[]=new BankAccount[10];
		
		// Constructor injection
		bankdetail[0]=new BankAccount(1,"Somanth",50000);
		bankdetail[1]=new BankAccount(2,"subha,",20000);
		bankdetail[2]=new BankAccount(3,"Ayan",500);
		bankdetail[3]=new BankAccount(4,"Ram",900);
		bankdetail[4]=new BankAccount(5,"Snehasish",30000);
		bankdetail[5]=new BankAccount(6,"Sudip",800);
		bankdetail[6]=new BankAccount(7,"Shaym",800);
		bankdetail[7]=new BankAccount(8,"Somu",6000);
		bankdetail[8]=new BankAccount(9,"Ravi",7000);
		bankdetail[9]=new BankAccount(10,"Raja",800000);
		
		// running the loop on bankdetail array
		for(int i=0;i<bankdetail.length;i++){
			// storing the amount in variable
			double amount=bankdetail[i].getAccBalance();
			// if amount is less than 1000
			if(amount<1000){
				
				System.out.println("\n------- Account "+i+" Detsils -------");
				System.out.println("The account id is : "+bankdetail[i].getAccId());
				System.out.println("The name is : "+bankdetail[i].getName());
				System.out.println("The account balance is : "+bankdetail[i].getAccBalance());
			} 
			
		} 
		
	} 
	
}