/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sen = sc.nextLine();
        String reverse = "";
        
        while(true){
            if(sen.indexOf(" ") == -1){
                reverse = sen + " " + reverse;
                break;
            }
        int space = sen.indexOf(" ");
        String word = sen.substring(0, space);
        reverse = word + " " + reverse;
        sen = sen.substring(space+1);
        }
        
        System.out.println(reverse);


		
	}
}
