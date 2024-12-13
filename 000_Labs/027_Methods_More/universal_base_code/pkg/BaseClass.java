/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int Str;
	int Dex;
	int Int;
	int Cha;

	public BaseClass() {
		role = "no role";
		int Str = 0;
		int Dex = 0;
		int Int = 0;
		int Cha = 0;
	}
	public String setRole(){
		return role;
	}
	public int setStr(){
		if(Str<0){
			Str = 0;
		}
		else{
			Str = Str;
			return Str;
		}
		return Str;
	}
	public int setDex(){
		if(Dex<0){
			Dex = 0;
		}
		else{
			Dex = Dex;
			return Dex;
		}
		return Dex;
	}
	public int setInt(){
		if(Int<0){
			Int = 0;
		}
		else{
			Int = Int;
			return Int;
		}
		return Int;
	}
	public int setCha(){
		if(Cha<0){
			Cha = 0;
		}
		else{
			Cha = Cha;
			return Cha;
		}
		return Cha;
	}
	public static boolean setAll(int Str, int Dex, int Int, int Cha){
		if((Str + Dex + Int + Cha) < 0){
			return false;
		}
		else{
			return true;
		}
	}
		
}

