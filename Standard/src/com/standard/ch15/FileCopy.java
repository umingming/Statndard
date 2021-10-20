package com.standard.ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(Path.filePath);
			FileOutputStream fos 
				= new FileOutputStream(Path.dirPath + "\\check2.txt");
			
			int data = 0;
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
