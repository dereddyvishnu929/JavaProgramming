package samplepgms;

public class CountOccuranceOfACharInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vishnu Vardhan Reddy";
		int totalcount = str.length();
		int totalcountafterremoving = str.replace("V", "").length();
		int count = totalcount-totalcountafterremoving;
		System.out.println("Number of occurances is : " + count);
		

	}

}
