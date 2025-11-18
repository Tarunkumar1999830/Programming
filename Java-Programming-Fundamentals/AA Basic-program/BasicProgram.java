package basicprograms;

import java.util.Scanner;

public class Basicpro {

	public static void main(String[] args) {
		
		System.out.println("enter a number : ");
		Scanner s = new Scanner(System.in);
		int x =s.nextInt();
		
		for (int i=1; i<x; i++) {
				int a = i%2;
				if(a==0) {                   //print even numbers
					System.out.println("Even Numbers are : "+i);
				}
			}
		
			for(int j=1;j<x;j++) {
				int b=j%2;
				if(b==1) {
					System.out.println("odd numbers : "+j);   //print odd numbers
				}
			}
	}
}
