package com.standard.ch11;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13}, {21,22,23}}; //2, 3
		
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("arr2D = " + Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); //01234
		int[] arr3 = Arrays.copyOf(arr, 3); //012
		int[] arr4 = Arrays.copyOf(arr, 7); //0123400
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); //2,3,4
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); //01234000
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);  //99999
		System.out.println(Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int)(Math.random() * 6) + 1);  
		System.out.println(Arrays.toString(arr7));
		
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
		}
		
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); //false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //true
		
		char[] chArr = {'A', 'D', 'E', 'B', 'C'};
		
		System.out.println(Arrays.toString(chArr));//ADBEC
		System.out.println(Arrays.binarySearch(chArr, 'B')); //NOT
		Arrays.sort(chArr);
		System.out.println(Arrays.toString(chArr));//ABCDE
		System.out.println(Arrays.binarySearch(chArr, 'B')); //1
		
	}

}
