package samplepgms;

public class SwappingTwoStrings {

	public static void main(String[] args) {
		String s1="Vishnu";
		String s2="Vardhan";
		System.out.println("Before Swapping string s1 :" + s1);
		System.out.println("Before Swapping string s2 :" + s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After Swapping string s1 :" + s1);
		System.out.println("After Swapping string s2 :" + s2);
		

	}

}
