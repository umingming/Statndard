package com.standard;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id : ");
			String id = s.nextLine().trim();
		
			System.out.println("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다.");
				continue;
			}
			
			if(!(map.get(id)).equals(password)){
				System.out.println("입력하신 비밀번호가 일치하지 않습니다.");
			} else {
				System.out.println("id와 비밀전호가 일치합니다.");
				break;
			}
		}
	}

}
