package com.standard.ch7;

public class InterfaceTest3 {

	public static void main(String[] args) {
		AA a = new AA();
		a.methodA();
		

	}

}

class AA{
	void methodA() {
		II i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

interface II{
	public abstract void methodB();
}

class BB implements II{
	public void methodB() {
		System.out.println("mehtodB in B class");
	}
	
	public String toString() {return "class B";}
}

class InstanceManager {
	public static II getInstance() {
		return new BB();
	}
}	