/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		int a = 0;
		int b = 0;
		int c = 0;
		while(a<arr.length){
			arr[a] = (int)(Math.random*10);
			a++;
		}
		int dupecheck = (int)(Math.random*10);
		while(b<arr.length){
			if(dupecheck == arr[b]){
				system.out.println(b)
				b++;
			}
		}
		while(c<arr.length){
			if(arr[c] == arr[c+1])
				system.out.println(c)
				c++;
			}
		}
	}
}
