package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
Scanner sc = new Scanner(System.in);
String name;
int age;
String breed;
	
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = new String ("big red dog");
	}
	public Dog(String N, int A, String B) {
		name = N;
		age = A;
		breed = B;
	}
	
public static void setName(){
	name = sc.nextLine();
}
public static void setAge(){
	age = sc.nextLine();
}
public static void setBreed(){
	breed = sc.nextLine();
}
public String getName(){
	return N;
}
public int getAge(){
	return A;
}
public String getBreed(){
	return B;
}
public static boolean isSleeping(){
	if(((Math.random()*100))<51){
		return true;
	}
	else{
		return false;
	}
}
public static void bark(){
	if(isSleeping() == false){
		System.out.println(N + " is barking");
	}
	else{
		System.out.println(N + " is not barking");
	}
}
}
