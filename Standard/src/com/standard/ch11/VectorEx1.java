package com.standard.ch11;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("3");
		v.add("4");
		print(v);
		
		v.trimToSize(); // capacity :3
		System.out.println("After trimToSize");
		print(v);
		
		v.ensureCapacity(6);  //가 뭐야..?
		System.out.println("After ensureCapacity(6)");
		print(v);
		
		v.setSize(7); //size를 7로 늘려..?
		System.out.println("After setSize(7)");
		print(v);
		
		v.clear();
		System.out.println("After.clear()");
		print(v);
		
	}

	private static void print(Vector v) {
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
	}

}
