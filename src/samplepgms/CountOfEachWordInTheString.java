package samplepgms;

import java.util.HashMap;

public class CountOfEachWordInTheString {

	public static void main(String[] args) {
		
		String s="vishnu vardhan reddy";
		
		String[] s1=s.split("");
		
		
		HashMap<String, Integer> emp = new HashMap<String,
				Integer>();
				for (String c : s1) {
				if (emp.containsKey(c)) {
				int x = emp.get(c);
				emp.put(c, x + 1);
				} else {
				emp.put(c, 1);
				}
				}
				System.out.println(emp);
				}
	}
				
				
