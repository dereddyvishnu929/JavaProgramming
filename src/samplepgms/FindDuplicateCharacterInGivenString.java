package samplepgms;

public class FindDuplicateCharacterInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "VishnuVardhan";
		int count = 0;
		char[] input = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(input[i] == input[j])
				{
					System.out.println("Duplicate characters are : "+input[j]);
					count++;
					break;
				}
			}
		}
		System.out.println("Duplicate characters count are : "+ count);

	}

}
