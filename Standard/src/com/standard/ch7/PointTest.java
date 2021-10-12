package com.standard.ch7;

public class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
		System.out.println(p3.x);
		System.out.println(p3.y);
		System.out.println(p3.z);

	}

}

class Point{
	int x = 10;
	int y = 20;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Point{
	int z = 30;

	Point3D(){
		this(100, 200, 300);
	}
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
		return String.format("x: %d, y: %d, z: %d", x, y, z);
	}
	
//	Point(int x, int y, int z){
//		super();
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
}