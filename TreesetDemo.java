package dep;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    // ALLOWS TO FOLLOW IN ASCENDING ORDER.....
		
TreeSet<String> ts =new TreeSet<String>();     //DONOT ALLOW DUPLICATE VALUES
ts.add("JAVA");
ts.add("C");
ts.add("NETWORKING");
ts.add("C");
System.out.println(ts);
ts.remove("C"); 
	  
     System.out.println("After removing element " + ts); 

     // Removing the first element 
     ts.pollFirst(); 

     System.out.println("After removing first " + ts); 

     // Removing the last element 
     ts.pollLast(); 

     System.out.println("After removing last " + ts); 
	}
}





