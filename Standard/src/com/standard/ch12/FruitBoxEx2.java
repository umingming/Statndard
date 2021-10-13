package com.standard.ch12;

import java.util.ArrayList;

class Fruit implements Eatable{
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit { public String tosString() { return "Apple"; }}
class Grape extends Fruit { public String tosString() { return "Grape"; }}
class Toy { public String tosString() { return "Toy"; }}

interface Eatable {}

public class FruitBoxEx2 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); 
		fruitBox.add(new Grape()); 
		
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);

	}

}

class FruitBox<T extends Fruit & Eatable> extends BBox<T>{}

class BBox<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() { return list.toString();}
}