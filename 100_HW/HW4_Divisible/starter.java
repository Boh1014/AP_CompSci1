/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme a number");
		int num1 = sc.nextInt();
		if(num1 % 2 == 0){
			System.out.println("This number is even");
		}
		else {
			System.out.println("This number is odd");
		}
		if (num1 % 3 == 0){
			System.out.println("This number is divisible by 3");
		}
		else{
			System.out.println("This number is not divisible by 3");
		}
		if (num1 % 4 == 0){
			System.out.println("This number is divisible by 4");
		}
		else{
			System.out.println("This number is not divisible by 4");
		}
		if (num1 % 5 == 0){
			System.out.println("This number is divisible by 5");
		}
		else{
			System.out.println("This number is not divisible by 5");
		}
		
		
		System.out.println("gimme another number");
		int num2 = sc.nextInt();
		if(num1 % 2 == 0){
			System.out.println("This number is even");
		}
		else {
			System.out.println("This number is odd");
		}
		if (num1 % 3 == 0){
			System.out.println("This number is divisible by 3");
		}
		else{
			System.out.println("This number is not divisible by 3");
		}
		if (num1 % 4 == 0){
			System.out.println("This number is divisible by 4");
		}
		else{
			System.out.println("This number is not divisible by 4");
		}
		if (num1 % 5 == 0){
			System.out.println("This number is divisible by 5");
		}
		else{
			System.out.println("This number is not divisible by 5");
		}
		
		
	}
}
