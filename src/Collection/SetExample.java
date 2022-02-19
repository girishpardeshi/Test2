package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<String> s= new HashSet<String>();
		Set<String> s= new LinkedHashSet<String>();
		s.add("Girish");
		s.add("Megha");
		s.add("Girish");
		
		for(String i:s)
		{
			System.out.println(i);  //Remove duplicate strings
		}
		
		Iterator<String> itr = s.iterator();
		System.out.println(itr.next());

	}

}
