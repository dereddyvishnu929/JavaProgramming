package Practicepgms;

import java.util.Scanner;

public class ConvertFarenheintIntoCelsius {

	public static void main(String[] args) {
		
		 float temp;
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter a temperature");
		 temp=sc.nextFloat();
		 temp=((temp-32)*5)/9;
		 System.out.println("Temperature in Celsius :" + temp);

	}

}
