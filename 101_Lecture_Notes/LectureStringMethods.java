/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/
import java.util.*;

class LectureStringMethods{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sen = sc.nextLine();
        
        int space1 = sen.indexOf(" ");
        String word1 = sen.substring(0, space1);
        int space2 = sen.indexOf(" ", space1+1);
        String word2 = sen.substring(space1+1, space2);
        
        System.out.println(word1);
        System.out.println(word2);
        while(true){
            if(sen.indexOf(" ") == -1){
                System.out.println(sen);
                break;
            }
        int space = sen.indexOf(" ");
        String word = sen.substring(0, space);
        System.out.println(word);
        sen = sen.substring(space+1);
        
        }
	}
}