package samplepgms;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		String s1="madam";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
			if(s2.equals(s1))
			{
				System.out.println("Given String is palindrome : " + s2);
			}
			else
			{
				System.out.println("Given String is not palindrome : " + s2);
			}

	}

}
