package dep;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("actor");
		ll.add("singer");
		ll.add("player");
ListIterator itr= ll.listIterator();
while(itr.hasNext()){
	String s=(String)itr.next();
	System.out.println(s);
}
	}

}
