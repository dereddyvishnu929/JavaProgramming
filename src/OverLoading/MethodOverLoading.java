package OverLoading;

public class MethodOverLoading {
	
	int x,y,z;
	double d;
	// approach 1 :  Method name should be same
	void sum()
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
	// approach 2 : Number of parameters should be different 
	void sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	// approach 3 : Data type of parameters should be different
	void sum(int a, double b )
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	// approach 4 : Order of parameters should be different
	void sum(double b, int a )
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	

	public static void main(String[] args) {
		MethodOverLoading mo=new MethodOverLoading();
		mo.sum(); //1 Method name should be same
		mo.sum(20,30); //2
		mo.sum(30,40.5); //3
		mo.sum(50.5,60); //4
	
		
		 
	}

}
