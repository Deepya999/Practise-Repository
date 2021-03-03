package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add("pacific");
		t.add("indian");
		t.add("bayofbengal");
		//t.add(09090); ///donot allow hetrogeneous values.
		//t.add(null); //donot have complile time error but runtime..
		System.out.println(t);
	}

}
