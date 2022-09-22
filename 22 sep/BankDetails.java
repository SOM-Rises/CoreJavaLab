/*
LAB TEST
3. Write a  java program to create a BankAccount and display the people with balance less than 1000.
name : somnath Hazra
@date : 22th sept,2022
*/
import java.util.Scanner;

// import all the methods from System
import static java.lang.System.*;

// Creating a class named BankAccount
class BankAccount{
	// properties of a account 
	private int accId;
	private String accHolderName;
	private double accBalance;
	
	// no argument constructor
	BankAccount(){}
	
	// parameterized constructor
	BankAccount(int accId,String accHolderName, double accBalance){
	//inttializing the variables
		this.accId=accId;
		this.accHolderName=accHolderName;
		this.accBalance=accBalance;
	}
	
	
	public int getAccId(){
		
		return accId;
	}
	
	
	public void setAccId(){
		
		this.accId=accId;
	}
	
	
	public String getAccHolderName(){
		
		return accHolderName;
	}
	
	
	public void setAccHoldername(){
		
		this.accHolderName=accHolderName;
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
		BankAccount bank1[]=new BankAccount[10];
		
		// Constructor injection
		bank1[0]=new BankAccount(1,"Somanth",50000);
		bank1[1]=new BankAccount(2,"subha,",20000);
		bank1[2]=new BankAccount(3,"Ayan",500);
		bank1[3]=new BankAccount(4,"Ram",900);
		bank1[4]=new BankAccount(5,"Snehasish",30000);
		bank1[5]=new BankAccount(6,"Sudip",800);
		bank1[6]=new BankAccount(7,"Shaym",800);
		bank1[7]=new BankAccount(8,"Somu",6000);
		bank1[8]=new BankAccount(9,"Ravi",7000);
		bank1[9]=new BankAccount(10,"Raja",800000);
		
		// running the loop on bank1 array
		for(int i=0;i<bank1.length;i++){
			// storing the amount in variable
			double amount=bank1[i].getAccBalance();
			// if amount is less than 1000
			if(amount<1000){
				
				out.println("\n------- Account "+i+" Detsils -------");
				out.println("The account id is : "+bank1[i].getAccId());
				out.println("The account holder name is : "+bank1[i].getAccHolderName());
				out.println("The account balance is : "+bank1[i].getAccBalance());
			} 
			
		} 
		
	} 
	
}