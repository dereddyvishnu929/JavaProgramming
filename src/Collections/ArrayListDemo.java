package Collections;


	import java.util.ArrayList;
import java.util.List;
	/*
	1.Heterogenious data-allowed
	2.Insertion order-preserved(index)
	3.Duplicate element-allowed
	4.multi nulls-allowed
	*/

	public class ArrayListDemo {

		public static void main(String[] args) {
			
			ArrayList mylist=new ArrayList();
			//List mylist=new ArrayList();
			//ArrayList<Integer> mylist=new ArrayList<Integer>();
			
			mylist.add(100);
			mylist.add(110.5);
			mylist.add("Vishnu");
			mylist.add(null);
			mylist.add(true);
			mylist.add(100);
			mylist.add(110.5);
			mylist.add(null);
			
			//Size of arraylist
			System.out.println(mylist.size());
			
			//print arraylist
			System.out.println(mylist);
			
			//remove value from array list
			mylist.remove(1);
			System.out.println("After removing : " + mylist);
			
			//adding value to arraylist if you wont mention index it will add at end
			mylist.add(10);
			System.out.println("After adding : " + mylist);
			
			////insertion value to arraylist in the place of index 1
			mylist.add(1, "Welcome");
			System.out.println("After insertion : " + mylist);
			
			for(Object list:mylist)
			{
				System.out.println(list);
			}
		
	      
		}

	}
