package samplepgms;

public class Test {

	public static void main(String[] args) {
		String str="VishnuVardhan";
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.println("Duplicate elements are :" + ch[j]);
					count++;
					break;
				}
			}
		}
	}

}
