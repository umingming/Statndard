package com.standard.ch12;

enum Direction { EAST, SOUTH, WEST, NORTH }

public class EnumEx1 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println(d1); //EAST
		System.out.println(d2); //WEST
		System.out.println(d3); //EAST
		
		System.out.println(d1==d2); //false
		System.out.println(d1==d3); //true
		System.out.println(d1.equals(d3)); //true
		System.out.println(d1.compareTo(d3));//false
		System.out.println(d1.compareTo(d2));//true
		
		switch(d1) {
		case EAST:
			System.out.println("EAST");
			break;
		case SOUTH:
			System.out.println("SOUTH");
			break;
		case NORTH:
			System.out.println("NORTH");
			break;
		case WEST:
			System.out.println("WEST");
			break;
		}
		
		Direction[] dArr = Direction.values(); //ESWN
		for(Direction d : dArr)
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
		//e0s1w2n3

		Direction d4 = Direction.EAST;
		System.out.println(d4.name());
	}

}
