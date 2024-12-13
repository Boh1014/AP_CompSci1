/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what day is it?");
		int day = sc.nextInt();
		if (day>0 && day<6) {
			System.out.println("Wake up at 7:00am");
		}
		else {
			System.out.println("Wake up at 10:00am");
		}

	}
}
