package com;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<20;i++){
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("deepya");
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
