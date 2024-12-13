/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your title");
		String title = sc.nextLine();
		System.out.println("choose your role");
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
		
		int points = 20;
		System.out.println("Assign points to a trait");
		System.out.println("max of 20 points and max 10 points in one trait ");
		System.out.println("How many points do you want to assign to Strength");
		int S = sc.nextInt();
		System.out.println(points - S + " points are remaining");
		System.out.println("How many points do you want to assign to Dexterity");
		int D = sc.nextInt();
		System.out.println(points - (D+S) + " points are remaining");
		System.out.println("How many points do you want to assign to Intelligence");
		int I = sc.nextInt();
		System.out.println(points - (I+D+S) + " points are remaining");
		System.out.println("How many points do you want to assign to Charisma");
		int C = sc.nextInt();
		System.out.println(points - (C+I+D+S) + " points are remaining");
		
		if((S > 10) || (D > 10) || (I > 10) || (C > 10)){
			System.out.println("too many points in one trait");
		}
		else if((S+D+I+C)>20){
			System.out.println("too many ponts spent");
		}
		else{
			System.out.println(name + " " + title);
			System.out.println(role);
			System.out.println(S + " Strength");
			System.out.println(D + " Dexterity");
			System.out.println(I + " Interlligence");
			System.out.println(C + " Charisma");
			if ((S+D+I+C) == 20){
				System.out.println(20-(S+D+I+C) + " points are remaining");
			}
			else {
				System.out.println(20-(S+D+I+C) + " points are remaining");
			}
		}
	}
}
