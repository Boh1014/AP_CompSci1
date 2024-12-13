/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what it your name?");
		String name = sc.nextLine();
		System.out.println("how many time do you want me to say your name?");
		int count = sc.nextInt();
		int x = 0;
		while(x <= count){
			System.out.println(name);
			x++;
		}
		



		
	}
}
