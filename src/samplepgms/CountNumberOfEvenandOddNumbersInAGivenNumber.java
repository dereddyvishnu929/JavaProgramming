package samplepgms;

public class CountNumberOfEvenandOddNumbersInAGivenNumber {

	public static void main(String[] args) {
		int n=123458948;
		int even_count=0, odd_count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.println("Number is Even : " + rem);
				even_count++;
				
			}
			else
			{
				System.out.println("Number is Odd : " + rem);
				odd_count++;
			}
			n=n/10;
		}
	}

}
