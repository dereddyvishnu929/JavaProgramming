package Practicepgms;

import java.util.Scanner;

public class UsingScannerpgm {

	public static void main(String[] args) {
		
		int x;
		float y;
		String z;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		z = sc.nextLine(); 
		System.out.println("You enters a String : " + z);
		
		System.out.println("Enter a integer value");
		x=sc.nextInt();
		System.out.println("You enter a integer value :" + x);
		
		System.out.println("Enter a float value");
		y=sc.nextFloat();
		System.out.println("You enter a float value : " + y);
		
		

}
}
