package com.standard.ch8;

import java.io.*;

public class ExceptionEx15 {

	public static void main(String[] args) {
		File f = createFile(args[0]);
		System.out.println(f.getName());

	}

	private static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다.");
		} catch(Exception e) {
			fileName = "제목없음.txt";
		} finally {
			File f = new File(fileName);
			createFile(f);
			return f;
		}
	}

	private static void createFile(File f) {
		try {
			f.createNewFile();
		} catch(Exception e) { }
		
	}

}
