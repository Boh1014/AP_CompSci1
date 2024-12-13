/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt ();
	System.out.println("Here are the next five numbers");
	System.out.print(number + 1 + ", ");
	System.out.print(number + 2 + ", ");
	System.out.print(number + 3 + ", ");
	System.out.print(number + 4 + ", ");
	System.out.println(number + 5);
	System.out.println("Here are the next five multiples");
	System.out.print(number * 1 + ", ");
	System.out.print(number * 2 + ", ");
	System.out.print(number * 3 + ", ");
	System.out.print(number * 4 + ", ");
	System.out.println(number * 5);
	System.out.println("Here is 1 divided by 100");
	System.out.println(number/100.0 + ", ");
	System.out.println("Here is 1 divided by 1000");
	System.out.println(number/1000.0 + ", ");

	
	
	}
}
