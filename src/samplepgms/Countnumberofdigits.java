package samplepgms;

public class Countnumberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456, res=0;
		while(n!=0)
		{
		n=n/10;
		res++;
		}
		System.out.println(res);
	}

}
