package Collections;

import java.util.HashSet;

/*
1.Heterogenious data-allowed
2.Insertion order-Not preserved(index)
3.Duplicate element-Not allowed
4.multi nulls-Not allowed/Only single null is allowed
*/

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet<Integer> myset=new HashSet<Integer>();
		
		myset.add("Vishnu");
		myset.add(100);
		myset.add(null);
		myset.add(10.5);
		myset.add(100);
		myset.add("Vishnu");
		myset.add('A');
		System.out.println(myset);
		
		System.out.println(myset.size());
		
		////After removing 
		myset.remove(100);
		System.out.println(myset);
		
		//Insertion not possible in Hashset due to index not preserved
		
		for(Object set:myset)
		{
			System.out.println(set);
		}
		
		

	}

}
