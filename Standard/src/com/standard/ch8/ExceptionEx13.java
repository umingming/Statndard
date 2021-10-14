package com.standard.ch8;

public class ExceptionEx13 {

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리");
			e.printStackTrace();
		}
		
	}

}
