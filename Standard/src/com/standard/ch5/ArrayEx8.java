package com.standard.ch5;

public class ArrayEx8 {

	public static void main(String[] args) {
		/*
		설계>
		1. 길이가 45인 int 배열
		2. for문
			>요소에 i + 1 저장
		3. temp, n 선언
		4. for문
			>셔플
		5. 출력
		*/
		
		int[] kards = new int[45];
		
		for(int i=0; i<kards.length; i++) {
			kards[i] = i + 1;
		}
		
		int temp, n;
		
		for(int i=0; i<6; i++) {
			n = (int)(Math.random() * 45) + 1;
			temp = kards[i];
			kards[i] = kards[n];
			kards[n] = temp;
		}
		
		for(int i=0; i<kards.length; i++) {
			System.out.printf(kards[i] + " ");
		}

	}

}
