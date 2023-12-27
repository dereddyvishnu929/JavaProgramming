package samplepgms;

public class CheckStringPresenceInAGivenArray {

	public static void main(String[] args) {
		String s1[]= {"abc","xyz","mno","abcd"};
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals("xyz"))
			{
				System.out.println("Given String is Present in a Array :" + s1[i]);
			}
			else
			{
				System.out.println("Given String is not Present in a Array :" + s1[i]);

			}
		}

	}

}
