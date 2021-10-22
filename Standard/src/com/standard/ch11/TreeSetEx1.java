package com.standard.ch11;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("car");
		set.add("sdf");
		set.add("gsd");
		set.add("ewggw");
		set.add("sdgsgd");
		set.add("sgd");
		set.add("esgd");
		set.add("dsge");
		set.add("ges");
		set.add("ges");
		set.add("geswe");
		
		System.out.println(set);
		
		System.out.println(from + to);
		
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to + "zzz"));

	}

}
