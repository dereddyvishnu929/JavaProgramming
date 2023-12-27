package Practicepgms;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		/*int x,y;
		int temp;
		
		Scanner sc=new Scanner(System.in);
		
		//with using temp variable
		System.out.println("Enter a x and y numbers ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swapping of two numbers :" + x + y);
		
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping of two numbers : " + x + y);
		*/
		
		//without using temp varaible
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a b c numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Beforer swapping of two numbers :" + a + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping of two numbers : " + a + b);
		
		 
		 
		
		

	}

}
