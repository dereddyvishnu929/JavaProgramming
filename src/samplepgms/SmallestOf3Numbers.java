package samplepgms;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
		int a=10, b=20, c=5;
		if(a<b && a<c)
		{
			System.out.println("a : " + a);
		}
		else if(b<a && b<c)
		{
			System.out.println("b : " + b);
		}
		else
		{
			System.out.println("c : " + c);
		}

	}

}
