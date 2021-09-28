package com.standard.ch5;

import java.util.Arrays;

public class ArrayEx1 {
	public static void main (String[] args) {
		int[] iArr = { 100, 95, 80, 70, 60 };
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i] + ", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr));
	}
}
