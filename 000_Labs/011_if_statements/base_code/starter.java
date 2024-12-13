/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x == y){ 
			System.out.println("apple");
		}
		else if(x > y){ 
			System.out.println("pineapple");
		}
		else{ 
			System.out.println("pen");
		}
	}
}
