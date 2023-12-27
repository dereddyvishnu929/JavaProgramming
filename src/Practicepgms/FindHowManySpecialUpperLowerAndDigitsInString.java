package Practicepgms;

public class FindHowManySpecialUpperLowerAndDigitsInString {

	public static void main(String[] args) {
		
		String s="WelCome#TotheB@ngaloreViShnu*1200";
		
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				count++;	
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count1++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				count2++;
			}
			else
			{
				count3++;
			}	
		}
		System.out.println("Total LowerCase letters are:" + count);	
		System.out.println("Total UpperCase letters are:" + count1);
		System.out.println("Total Number of Digits are:" + count2);
		System.out.println("Total Number of Special Characters are:" + count3);

	}

}
