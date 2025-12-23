package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Shiva");
		hs.add("Ajmer");
		hs.add("sabrina");
		hs.add("singh");
		hs.add("Katy");
		hs.add("Ajmer");
		System.out.println(hs);
		System.out.println("size of hashset is " +hs.size());
		
		hs.remove("Ajmer");
		System.out.println(hs);
		System.out.println("size of hashset is " +hs.size());
		if(hs.contains("Ajmer")) {
			System.out.println("Ajmer is present in set");
		}
		else {
			System.out.println("Ajmer is not present in set");
		}
		System.out.println(hs);
		System.out.println("size of hashset is " +hs.size());
		
	}

}

