package samplepgms;

public class FindSumOfDigitsInANumber {

	public static void main(String[] args) {
		int n=12345;
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
	    }
		System.out.println("Sum of Digts in a number : " + sum);


	}

}
