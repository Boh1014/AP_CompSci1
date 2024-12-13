/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		toString(string);
		String a = sc.nextLine();
		String b = sc.nextLine();
		toCombineString(a,b);



		
	}
	
	public static void toString(String string){
		System.out.println(string);
	}
	
	public static void toCombineString(String a, String b){
		System.out.println(a + " " + b);
	}
	
}
