/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers */

import java.util.*;
class ExThree
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		int s3 = s1 + s2;
		System.out.println("The sum of input values is = " + s3);
	}
}