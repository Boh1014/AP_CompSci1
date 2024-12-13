/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*1000);
		System.out.println("I am thinking of a number 1-1000 \ntry to guess it");
		int guess = sc.nextInt();
		while(true){
			if (guess == random){
				System.out.println("YOU GUESSED IT");
				break;
			}
		System.out.println("try again");
		guess = sc.nextInt();
		}
		



		
	}
}
