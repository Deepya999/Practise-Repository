package com;

import java.util.ArrayList;

class Array1{
	public static void main(String[]args){
	ArrayList<String> al=new ArrayList<>();
	
	al.add(0,"deepya");
	al.add(1,"is");
	al.add(1,"is");
	al.add(3,"common");
	al.add(4,"girl");
	System.out.println(al);
	
	al.set(2, "bad");
	System.out.println(al);
	System.out.println("cloned"+al.clone());
	System.out.println("boolen value:"+al.contains("is"));
	System.out.println("it have:"+al.get(4));
	System.out.println("Index of:"+al.indexOf("common"));
	System.out.println("Returns empty or not:"+al.isEmpty());
	System.out.println("Size:"+al.size()); 
	
	// creating another arrayist
	ArrayList<String> al2=new ArrayList<String>();
	al2.addAll(al);
	System.out.println(al);
	}

	}