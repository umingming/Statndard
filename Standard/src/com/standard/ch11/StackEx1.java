package com.standard.ch11;

import java.util.Stack;

public class StackEx1 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음"); //back; 1,2,3,4
		
		printStatus(); //현재화면은 다음입니다.
		
		goBack(); //forwark; 4
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus(); //현재 화면은 네이버 입니다, back ; 1,2,3
		
		goBack();//forward; 4,3
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();//현재 화면은 야후입니다 back; 1,2
		
		goForward();//back; 1,2,3
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printStatus();//현재 화면은 네이버 입니다., forwark; 4

		goURL("codechobo.com");//back; 1,2,3,초보
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();//현재 화면은 초보 입니다. forward null

	}

	private static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
		
	}

	private static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
		
	}

	private static void printStatus() {
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("현재 화면은 '" + back.peek() + "' 입니다.");
		System.out.println();
	}

	private static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}

}
