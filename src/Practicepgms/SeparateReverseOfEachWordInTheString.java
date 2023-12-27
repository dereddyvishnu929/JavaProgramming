package Practicepgms;

public class SeparateReverseOfEachWordInTheString {

	public static void main(String[] args) {
		
		String s="cat demo";
		String[] s1=s.split("s");
		String reversestring="";
		
		for(int i=0;i<s1.length;i++)
		{
			String t=s1[i];
			String reverseword="";
			for(int j=t.length()-1;j>=0;j--)
			{
				reverseword=reverseword+t.charAt(j);
			}
			reversestring=reverseword+reversestring+" ";
		}
		System.out.println(reversestring);
	}

}
