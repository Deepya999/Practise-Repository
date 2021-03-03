package com;
import java.util.*;
public class HashsetDemo {
	public static void main(String[]args){
		HashSet<String> h=new HashSet();
		h.add("sun");
		h.add("moon");
		h.add("stars");
		h.add("space");
		h.add(null);
		h.add("");
		h.add("  ");
		System.out.println("hashcode is:"+h.hashCode());
		System.out.println(h);
		h.addAll(h);
		System.out.println(h);
	h.clear();
	System.out.println(h);
	h.clone();
	System.out.println(h);
	System.out.println("serach :"+h.contains(null));
	h.containsAll(h);
	System.out.println("equals:"+h.equals(""));
	System.out.println(h.iterator());
	
	}

	

}
