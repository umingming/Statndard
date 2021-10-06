package com.standard.ch6;

public class BlockTest {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		BlockTest bt = new BlockTest();
	}

}
