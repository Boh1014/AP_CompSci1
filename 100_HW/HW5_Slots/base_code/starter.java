/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot machine rules:");
		System.out.println("YOU HAVE TO PLAY");
		System.out.println("You start with 100 and if you run out: GAME OVER");
		
		int money = 100;
		while(true){
			if(money<=0){
			System.out.println("you have no more money");
			break;
			}
		 System.out.println("Do you want to play? Yes/yes/Y/y");
		 String answer = sc.nextLine();
			if(answer.equals("Yes")||answer.equals("yes")||answer.equals("Y")||answer.equals("y")){
				System.out.println("Enter how much you want to bet");
				int bet = sc.nextInt();
				if(bet == 0 || bet < 0 ) {
					System.out.println("Invalid amount");
					System.out.println("Try again");
					bet = sc.nextInt();
				}
				else if(bet > money) {
					System.out.println("You don't have enough money");
					System.out.println("Try again");
					bet = sc.nextInt();
				}
				money = money - bet;
				int a = (int)(Math.random()*10);
				int b = (int)(Math.random()*10);
				int c = (int)(Math.random()*10);
				System.out.println(a + "|" + b + "|" + c);
				if (a == b && a == c){
					System.out.println("JACKPOT your bet is tripled");
					bet = bet * 3;
					money = money + bet;
				}
				else if (a == b || a == c || b == c){
					System.out.println("WINNER your bet is doubled");
					bet = bet * 2;
					money = money + bet;
				}
				else {
					System.out.println("oh no you lost your bet");
					bet = 0;
					
				}
			}
			
		}
			
		
	}
}
