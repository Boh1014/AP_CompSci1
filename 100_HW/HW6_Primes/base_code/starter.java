/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		checkPrime(a);
		
	/*	int number = sc.nextInt();
		printPrimes(number); */
	}
	public static void checkPrime(int a){
		int count = 0;
		while(a != count && a - count != 1){
		if (a % (a - count) == 0){
			System.out.println("false");
			break;
		}
			count ++;
		}
		System.out.println("true");
	}
	/*public static void printPrimes(int c){
		int d = 0;
		while(c >= d){
			if(checkPrime(d) == true){
				System.out.println(d);
			}
			d ++;
		}
	} */
}
