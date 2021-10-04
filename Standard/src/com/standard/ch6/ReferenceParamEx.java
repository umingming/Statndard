package com.standard.ch6;

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data n = new Data();
		n.x = 10;
		System.out.println(n.x);
		
		change(n);
		System.out.println(n.x);
		

	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println(d.x);
	}

}
