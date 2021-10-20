package com.standard.ch15;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		try {
			
			BufferedReader reader 
			= new BufferedReader(new FileReader(Path.dirPath));
			
			String line = "";
			while((line = reader.readLine()) != null {
				dks
			}
			
			reader.close();
			
			
			

			String line = "";
			while((line = reader.readLine()) != null) {
				if(line.indexOf(".") != -1){
					System.out.println(line);
				}
			}
			
			reader.close();
			
		} catch (Exception e) {
		}

	}

}
