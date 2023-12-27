package Practicepgms;

import java.util.Arrays;

public class FindThirdMaximumNumber {

	public static void main(String[] args) {
		
		int a[]= {-10,20,40,10,50,30};
		
		//Method1
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;;
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]+" ");
		}
		
		System.out.println("Third largest number : " + a[a.length-3]);
		
		// Method2
		/*
		Arrays.sort(a);
		System.out.println("Sorted array" + Arrays.toString(a));
		int max=a[a.length-3];
		System.out.println( "Third max number is :"+max);
		*/

	}

}
