package com.standard.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlowEx27 {

	public static void main(String[] args) throws Exception{
		int num;
		int sum = 0;
		boolean flag = true;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("합계를 구할 숫자를 입력하세요.");
		
		while(flag) {
			System.out.println(">>");
			
			num = Integer.parseInt(reader.readLine());

			if(num != 0) {
				sum += num;
			} else {
				flag = false;
			}
		}
		System.out.println(sum);
	}

}
