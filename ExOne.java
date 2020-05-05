//Hands-on Assignments for Language Basics 

 /*Write a Program that accepts two Strings as command line arguments and generate the output in the required format. */
 import java.util.*;
 class ExOne
 {
	 public static void main(String args[])
	 {	
		 Scanner myObj = new Scanner(System.in);
				
			String Name1 = myObj.nextLine();  // Read user input
			String Name2 = myObj.nextLine();
			System.out.println("Output in correct format: "+Name1+" Technologies "+Name2); 
	 }
 }