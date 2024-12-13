/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*1000);
		System.out.println("I am thinking of a number 1-1000. Try to guess it");
		int guess = sc.nextInt();
		if (num == guess){
			System.out.println("YOU GUESSED IT");
		}
		else{
			System.out.println("wrong");
		}
	}
}
