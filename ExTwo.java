 /*Write a Program to accept a String as a command line argument and print a Welcome before the string.*/
 
 import java.util.*;
 class ExTwo
 {
	 public static void main(String args[])
	 {
		 Scanner s = new Scanner(System.in);
 		 String s1 = s.nextLine();
		 System.out.println("Welcome " + s1);
	 }
 }