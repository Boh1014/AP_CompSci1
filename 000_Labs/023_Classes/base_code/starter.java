/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class character{
	String role = new String("Warrior");
	int S = 7;
	int D = 5;
	int I = 3;
	int C = 5;
}

class starter {
	public static void main(String args[]) {
		character mychar = new character();
		System.out.println(mychar.S);
		System.out.println(mychar.D);
		System.out.println(mychar.I);
		System.out.println(mychar.C);



		
	}
}
