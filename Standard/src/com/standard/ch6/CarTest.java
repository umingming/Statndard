package com.standard.ch6;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("whit", "auto", 4);
		
		Car c3 = new Car("green");
		
		System.out.println(c1.color + ":" + c1.gearType + ":" + c1.door);
		System.out.println(c2.color + ":" + c2.gearType + ":" + c2.door);
		System.out.println(c3.color + ":" + c3.gearType + ":" + c3.door);

	}

}

class Car{
	String color;
	String gearType;
	int door;
	Car() {
		
	}
	
	Car(String c){
		this(c, "auto", 4);
		door = 5;
	}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}
