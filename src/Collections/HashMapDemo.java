package Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "Vishnu");
		hm.put(102, "Vardhan");
		hm.put(103, "Reddy");
		hm.put(104, "Dereddy");
		hm.put(101, "Vishnu");
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		//remove pair 104
		hm.remove(104);
		System.out.println("After removing : " + hm);
		
		//print only specific pair 101
		System.out.println(hm.get(101));
		
		//Print only key from HashMap
		System.out.println(hm.keySet());
		
		//Print only Values from HashMap
		for(Object k:hm.keySet())
		{
			System.out.println(k + "     " + hm.get(k));
        }
		
		hm.clear();
		System.out.println(hm);

	}

}
