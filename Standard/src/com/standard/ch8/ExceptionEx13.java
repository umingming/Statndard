package com.standard.ch8;

public class ExceptionEx13 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리");
			e.printStackTrace();
		}
	}

	private static void method1() throws Exception {
		
		throw new Exception();
	}

}
