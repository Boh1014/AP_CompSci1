/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int Strength;
	int Dexterity;
	int Intelligence;
	int Charisma;
	
	public BaseClass(){
		Strength = 0;
		Dexterity = 0;
		Intelligence = 0;
		Charisma = 0;
	}

	public void myToString(){
		System.out.println("your strength is " + Strength);
		System.out.println("your dexterity is " + Dexterity);
		System.out.println("your intelligence is " + Intelligence);
		System.out.println("your charisma is " + Charisma);
	}

}

