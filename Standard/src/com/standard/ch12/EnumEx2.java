package com.standard.ch12;

enum DDirection{
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");
	
	DDirection(int i, String symbol) {
		this.value = i;
		this.symbol = symbol;
	}

	private static final DDirection[] DIR_ARR = DDirection.values();
	private final int value;
	private final String symbol;
	
	public int getValue() {
		return value;
	}
	public String getSymbol() {
		return symbol;
	}
	
	public static DDirection of(int dir) {
		if(dir < 1 || dir > 4) {
			throw new IllegalArgumentException("Invalid value : " + dir);
		}
		return DIR_ARR[dir - 1];
	}
	
	public DDirection rotate(int num) {
		num = num % 4;
		if(num < 0) num += 4;
		return DIR_ARR[(value-1+num)%4];
	}
	
	public String toString() {
		return name()+getSymbol();
	}
	
}//enum

public class EnumEx2 {

	public static void main(String[] args) {
		for(DDirection d : DDirection.values())
			System.out.printf("%s=%d%n", d.name(), d.getValue());
		
		DDirection d1 = DDirection.EAST;
		DDirection d2 = DDirection.of(1); //EAST
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		System.out.println(DDirection.EAST.rotate(0));
		System.out.println(DDirection.EAST.rotate(2));
		System.out.println(DDirection.EAST.rotate(-1));
		System.out.println(DDirection.EAST.rotate(-2));

	}

}
