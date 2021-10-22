package com.standard.ch11;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		while(set.size()<6) {
			int num = (int)(Math.random() * 45) +1;
			set.add(num);
		}
		
		System.out.println(set);
	}

}
