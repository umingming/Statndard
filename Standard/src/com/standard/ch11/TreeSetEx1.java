package com.standard.ch11;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "나";
		String to = "라";
		
		set.add("abc");
		set.add("car");
		set.add("sdf");
		set.add("나다라");
		set.add("앙ㅎ대");
		set.add("sdgsgd");
		set.add("라라라");
		set.add("라");
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
