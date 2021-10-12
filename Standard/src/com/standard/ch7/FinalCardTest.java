package com.standard.ch7;

public class FinalCardTest {

	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
		System.out.println(c.KIND);    //heart
		System.out.println(c.NUMBER);  //10
		System.out.println(c);  //heart 10

	}

}

class Card {
	final String KIND;
	final int NUMBER;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int number) {
		KIND = kind;
		NUMBER = number;
	}
	
	Card() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
	
	
}
