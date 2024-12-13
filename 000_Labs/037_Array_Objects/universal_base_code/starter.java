/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] x = new Wizard [100];
		Warrior [] y = new Warrior [100];
		for(int i = 0; i < x.length; i++){
			x[i] = new Wizard();
			y[i] = new Warrior();
		}
		int a = 0;
		int b = 0;
		while( a < x.length && b < y.length){
			x[a].attack(y[b]);
			if(y[b].isDead()){
			System.out.println(y[b].getName() + " has died");
				b++;
				if(b>=100){
					System.out.println("The Wizards have won");
					break;
				}
			}
			y[b].attack(x[a]);
			if(x[a].isDead()){
			System.out.println(x[a].getName() + " has died");
				a++;
				if(a>=100){
					System.out.println("The Warriors have won");
					break;
				}
			}
		}
		
		
		

	}
}

