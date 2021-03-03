package dep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class EntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer , String> mapitr = new HashMap<>();
		//enter values
		mapitr.put(0, "hi");
		mapitr.put(1, "hello");
		mapitr.put(2, "welcome");
		mapitr.put(3, "hey");
		
		Iterator<Entry<Integer, String>> iterator= mapitr.entrySet().iterator();
		
while(iterator.hasNext()){
	Entry<Integer ,String> entry=iterator.next();
	System.out.println(entry.getValue());
	System.out.println(entry.getKey());
	
		
	}
			
		}
	}


