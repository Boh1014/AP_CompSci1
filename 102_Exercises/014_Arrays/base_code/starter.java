/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	 public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int i = 0;
		 int v = 3;
		 System.out.println("array 1");
		 while (i<arr.length){
		 	arr[i] = v;
		 	System.out.println(i + "   " + arr[i]);
		 	i++;
		 	v = v + 3;
		 }
		 System.out.println("array 2");
		int [] arr2 = new int[1001];
		int a = 0;
		int b = 1000;
		while (a < arr2.length){
			arr2[a] = b;
			System.out.println(a + "   " + arr2[a]);
			a++;
			b--;
		}
		/*int [] arr = new int[1001];
		 int i = 0;
		 int v = 3;
		 int [] arr2 = new int[1001];
		int a = 0;
		int b = 1000;
		System.out.println("array 1 | array 2");
		 while (i<arr.length){
		 	arr[i] = v;
		 	arr2[a] = b;
		 	System.out.println(i + "   " + arr[i] + "|" + " " + a + "   " + arr2[a]);
		 	a++;
			b--;
		 	i++;
		 	v = v + 3;
		 }*/
	}
}
