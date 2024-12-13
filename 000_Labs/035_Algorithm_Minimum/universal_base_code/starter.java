/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int a =(int)(50+Math.random()*150);
		int [] arr = new int[a];
		int b = 0;
		while(b<arr.length){
			arr[b] = (int)(Math.random()*100);
			b++;
		}
		System.out.println("the average is " + getaverage(arr));
		System.out.println("the min is " + getmin(arr));
		System.out.println("the max is " + getmax(arr));
		
		
		
		


		
	}
	
	public static int getaverage(int [] x){
	int d = 0;
	int sum = 0;
		while(d<x.length){
			sum = sum + x[d];
			d++;
		}
	return sum/d;
	}
	public static int getmin(int [] y){
	int e = 0;
	int min = 200;
		while(e<y.length){
			if (y[e]<min){
				min = y[e];
			}
			e++;
		}
	 return min;
	}
	public static int getmax(int [] z){
	int f = 0;
	int max = 1;
		while(f<z.length){
			if (z[f]>max){
				max = z[f];
			}
			f++;
		}
	return max;
	}
		
	
}
