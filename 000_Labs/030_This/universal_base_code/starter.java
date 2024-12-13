/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int x = 0;
		PooleDwarf test = new PooleDwarf();
		PooleDwarf a = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf b = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf c = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf d = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf e = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf f = new PooleDwarf(randName(), (int)(Math.random()*7));
		if(test.isSameName(a.getName())){
			x++;
		}
		if(test.isSameName(b.getName())){
			x++;
		}
		if(test.isSameName(c.getName())){
			x++;
		}
		if(test.isSameName(d.getName())){
			x++;
		}
		if(test.isSameName(e.getName())){
			x++;
		}
		if(test.isSameName(f.getName())){
			x++;
		}
		System.out.println("The name of test is repeated " + x + " times");
		
	
		

		
		
	}
}
