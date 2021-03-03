package com;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Liked1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ls=new LinkedList<>();
		
	ls.add("nj");
	ls.add("dhs");
	ls.add("djjcd");
	System.out.println(ls);
	
	//HASH SET
	
	Set<String> si= new HashSet<String>();
	
	si.addAll(ls);
	System.out.println(si);
	 si.remove("nj");
	 System.out.println(si);
	 
	 //replace
	 si.size();
	 System.out.println("The size of the linked list is: " 
             + si.size()); 
	si.clear();
	System.out.println("Fibal set is:" + si);
	
	
	System.out.println("it is:" + si.contains("dhs"));

}
}




