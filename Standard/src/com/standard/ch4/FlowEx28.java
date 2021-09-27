package com.standard.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlowEx28 {

	public static void main(String[] args) throws Exception {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.print("1과 100사이의 정수를 입력 : ");
			input = Integer.parseInt(reader.readLine());

			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while (input != answer);
		System.out.println("정답입니다.");

	}

}
