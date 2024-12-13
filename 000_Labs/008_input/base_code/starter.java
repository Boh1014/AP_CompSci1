/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.nextLine ();
		System.out.println("Hello, " + name); 
		System.out.println("enter your age");
		int age = sc.nextInt ();
		sc.nextLine();
		System.out.println("enter your birthday");
		String birthday = sc.nextLine ();
		System.out.println("how much is a buck fifty");
		double money = sc.nextDouble ();
		
		
		
	
	}
}
