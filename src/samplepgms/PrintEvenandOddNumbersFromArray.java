package samplepgms;

public class PrintEvenandOddNumbersFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even numbers are : " + a[i]);
			}
			else
			{
				System.out.println("Odd numbers are : " + a[i]);
			}
		}

	}

}
