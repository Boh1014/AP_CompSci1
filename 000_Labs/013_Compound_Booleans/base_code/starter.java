/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(( a > b) && ( a > c)) {
			System.out.println(a + " is the largest int");
		}
		else if(( b > a) && ( b > c)) {
			System.out.println(b + " is the largest int");
		}
		else if(( c > b) && ( c > a)){
			System.out.println(c + " is the largest int");
		}
		else{
			System.out.println("at least two of the numbers are equal");
		}
		if(( a < b) && ( a < c)) {
			System.out.println(a + " is the smallest int");
		}
		else if(( b < a) && ( b < c)) {
			System.out.println(b + " is the smallest int");
		}
		else if(( c < b) && ( c < a)){
			System.out.println(c + " is the smallest int");
		}
		else{
			System.out.println("at least two of the numbers are equal");
		}
	}
		
}
