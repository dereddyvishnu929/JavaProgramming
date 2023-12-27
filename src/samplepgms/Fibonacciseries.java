package samplepgms;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=5;
		int a=0, b=1,c;
		System.out.print(" "+a);
		System.out.print(" "+b);
		for(i=0;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}

	}

}
