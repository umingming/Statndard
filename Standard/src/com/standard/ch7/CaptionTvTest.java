package com.standard.ch7;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp(); //11
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, world");  //X
		ctv.caption = true;
		ctv.displayCaption("Hello, world!");  //O

	}

}

class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
