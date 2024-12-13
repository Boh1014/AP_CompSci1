/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String  role = sc.nextLine();
		if (role.equals("wizard") || role.equals("Wizard")){
			System.out.println("You can use magic");
		}
		else if (role.equals("warrior") || role.equals("Warrior")){
			System.out.println("You are very good at swinging a sword");
		}
		else if (role.equals("rogue") || role.equals("Rogue")){
			System.out.println("You are very good at sneaking around");
		}
		else{
			System.out.println("You are a normal guy");
		}
	}
}
