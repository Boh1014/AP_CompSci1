/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first int");
		int num1 = sc.nextInt();
		System.out.println("Enter second int larger than the first");
		int num2 = sc.nextInt();
		System.out.println("your range is " + num1 + " to " + num2);
		System.out.println("Here are 5 numbers generated in that range");
		int a = (int)(num1 + (Math.random()*(num2-num1)));
		int b = (int)(num1 + (Math.random()*(num2-num1)));
		int c = (int)(num1 + (Math.random()*(num2-num1)));
		int d = (int)(num1 + (Math.random()*(num2-num1)));
		int e = (int)(num1 + (Math.random()*(num2-num1)));
		System.out.println(a + " , " + b + " , " +  c + " , "  + d  + " , " + e);
	}
}
