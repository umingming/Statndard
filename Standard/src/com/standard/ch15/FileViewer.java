package com.standard.ch15;

import java.io.FileInputStream;

public class FileViewer {

	public static void main(String[] args) {
		try {
			String path = "C:\\class\\java\\file\\check.txt";
			FileInputStream fis = new FileInputStream(path);
			int data = 0;
			
			while((data = fis.read()) != -1) {
				char c = (char)data;
				System.out.print(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
