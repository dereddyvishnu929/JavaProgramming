package samplepgms;

public class Swappingnubers {
	
	public static void main(String[] args) {
		int a=30,b=40;
		//int temp;
		System.out.println("Before swapping"+ " " +a + " "+b);
		/*temp=a;
		a=b;
		b=temp;*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping"+ " "+a + " "+b);
	}

}
