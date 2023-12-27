package Practicepgms;

public class FindTheDuplicateCountInAnArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,10,40,50,10};
		int count=0;
		int i,j;
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}
		System.out.println("Duplicate element are : " + count);
	}

}
