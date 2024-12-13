/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		pow(a,b);
		



		
	}
public static void pow(double x, double y){
		double answer = 0;
		if (y > 1){
			while(y != 1){
				answer = x;
				answer = answer * x;
				y -= 1;
			}
			System.out.println(answer);
		}
		if(y < -1){
			answer = x;
			while(y != -1){
				answer = answer * x;
				y += 1;
			}
			System.out.println(1.0/answer);
		}
		if(y == 0){
			answer = 0;
			System.out.println(answer);
		
		}
	}
}
