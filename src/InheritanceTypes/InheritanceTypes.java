package InheritanceTypes;

class A //Parent class
{
  int a=10;
  void display() {
	  System.out.println(a);
  }
}
class B extends A //child class
{
	int b=20;
	void show() {
		System.out.println(a+b);
	}
}
class C extends B
{
	int c=30;
	void print() {
		System.out.print(a+b+c);
	}
}

public class InheritanceTypes {
	

	public static void main(String[] args) {
		 C cobj=new C();
		 cobj.display();
		 cobj.show();
		 cobj.print();
		 

	}

}
