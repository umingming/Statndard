package com.standard.ch7;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();  //water!
		car = fe; //stop, drive
		fe2 = (FireEngine)car; //stop, drive, water
		fe2.water();

	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr!");
	}
	
	void stop() {
		System.out.println("stop@!!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!");
	}
}