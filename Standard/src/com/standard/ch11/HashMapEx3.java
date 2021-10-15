package com.standard.ch11;

import java.util.*;

public class HashMapEx3 {
	
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-1111");
		addPhoneNo("회사", "박대리", "010-333-1111");
		addPhoneNo("세탁", "박대리", "010-333-1111");
		
		printList();

	}//main
	
	static void addPhoneNo (String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}

	private static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	static void addPhoneNo (String name, String tel) {
		addPhoneNo("기타", name, tel);
	}

	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo); 
			}
			System.out.println();
		}
	}
}
