/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter {
	String role;

	public MyCharacter() {
		role = new String("no role");
		
	}
	public MyCharacter(String r) {
		role = r;
	}
	
	public void Voiceline(){
		if(role == "Warrior"){
			System.out.println("ROAR, you are a warrior");
		}
		else if(role == "Wizard"){
			System.out.println("*MAGIC*, you're a wizard");
		}
		else if(role == "Rouge"){
			System.out.println("SNEAKY, you're a rouge");
		}
		else{
			System.out.println("no role");
		}
	}

}

