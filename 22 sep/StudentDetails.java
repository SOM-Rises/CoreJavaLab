/*
Program: 2. Write a Student and create an array of 10 students
			and display the students whose marks are more than 90%.
@author: Somnath Hazra
@date: 22nd Sept, 2022
*/

// import all the methods from System
import java.util.*;

// Creating a class named StudentDetails
class StudentDetails
{
	// properties of a student 
	String S_name;
	int S_id;
	float totalPercentage;
	
	//  paarmeterized constructor
	StudentDetails(String S_name, int S_id, float totalPercentage)
	{
		this.S_name = S_name;
		this.S_id = S_id;
		this.totalPercentage = totalPercentage;
	}
	
	//display method
	void display()
	{
		System.out.println("Student Name: "+S_name);
		System.out.println("Student id: "+S_id);
		System.out.println("Student totalPercentage: "+totalPercentage);
	}
	
	//main method
	public static void main(String args[])
	{
		
		//creatin array
		StudentDetails[] std = new StudentDetails[3];
		Scanner sc = new Scanner(System.in);
       
	   
	   //for loop to insert details
        for(int i = 0; i < 3; i++)
		{
            System.out.print("Name: ");
            String S_name = sc.next();
			
            System.out.print("Id: ");
            int S_id = sc.nextInt();
			
            System.out.print("Percentage: ");
            float totalPercentage = sc.nextFloat();
			
            std[i] = new StudentDetails(S_name, S_id, totalPercentage);
        }
		
		//for loop for find the student
        for(int i = 0; i < std.length; i++)
		{	
			if(std[i].totalPercentage >= 90)
			{
				std[i].display();
			}
        }
		
	}
}