/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sen = sc.nextLine();
    
    	while(true){
            if(sen.indexOf(" ") == -1){
                System.out.println(spongeCase(sen));
                break;
            }
        int space = sen.indexOf(" ");
        String word = sen.substring(0, space);
        System.out.println(spongeCase(word));
        sen = sen.substring(space+1);
        
        }
	}	
	public static String spongeCase(String word){
		String result = "";
    	for(int a = 0; a < word.length(); a++){
    	String letter = word.substring(a, a+1);
    		if(a % 2 == 0){
    			letter = letter.toLowerCase();	
    		}
    		else{
    			letter = letter.toUpperCase();
    		}
    	result = result + letter;
    	}
    	return result;
		}
	}

