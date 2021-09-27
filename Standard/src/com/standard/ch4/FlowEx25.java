package com.standard.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlowEx25 {

	public static void main(String[] args) throws Exception{
		int num = 0, sum = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자를 입력하세요 : ");
		num = Integer.parseInt(reader.readLine());
		
		while(num != 0) {
			
			sum += num % 10;
			System.out.printf("%d, %d%n", sum, num);
			
			num /= 10;
		}
		
		System.out.println(sum);
	}

}
