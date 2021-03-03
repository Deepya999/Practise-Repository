package dep;
import java.util.*;
import java.util.Map.Entry;
public class Entryset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <String, String> hm=new HashMap<>();
hm.put("actor", "John");
hm.put("singer", "james");
hm.put("dancer", "jenni");
Iterator<Entry<String, String>>  iterator =hm.entrySet().iterator();
while(iterator.hasNext()){
	Entry<String,String> deepya=iterator.next();
	System.out.println(deepya.getValue());
	System.out.println(deepya.getKey());
	
}
	}

}
