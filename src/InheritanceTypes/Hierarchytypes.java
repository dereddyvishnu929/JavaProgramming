package InheritanceTypes;

class parent{
	void display(int a)
	{
		System.out.println(a);
	}
}
class child1 extends parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}
class child2 extends parent
{
	void print(int c) {
		System.out.println(c);
	}
}

public class Hierarchytypes {

	public static void main(String[] args) {
		child1 cobj=new child1(); 
		cobj.show(10);
		cobj.display(20);
		
		child2 cb=new child2();
		cb.print(30);
		cb.display(40);
		
		

	}

}
