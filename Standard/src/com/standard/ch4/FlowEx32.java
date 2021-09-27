package com.standard.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlowEx32 {

	public static void main(String[] args) throws Exception{
		int menu = 0;
		int num = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("1. square");
			System.out.println("2. square root");
			System.out.println("3. log");
			System.out.print("원하는 메뉴를 선택하세요.");
			
			menu = Integer.parseInt(reader.readLine());
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
			
			System.out.printf("선택하신 메뉴는 %d번 입니다.", menu);
		}

	}

}
