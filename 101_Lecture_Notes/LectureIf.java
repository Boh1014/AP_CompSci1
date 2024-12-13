/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
		System.out.println("Let's go on an adventure!!");
		System.out.println("choose a path");
		System.out.print("1. wide, lit path");
		System.out.print("2. narrow, dark path");
		
		int answer = sc.nextInt();
		if(answer == 1){ 
			system.out.println("you start to sink into the ground");
		}
		else if(answer == 2){ 
			system.out.println("you start to fly");
		}
		else{ 
			system.out.println("END");

	}
}