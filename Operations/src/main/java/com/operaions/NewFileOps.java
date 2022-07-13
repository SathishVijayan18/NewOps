package com.operaions;

import java.io.BufferedReader;
import java.io.FileReader;

public class NewFileOps {

	public static void main(String[] args) {
		
		BufferedReader br;
		//String line="";
		try {
			br = new BufferedReader(new FileReader("D:\\javaProj\\out.txt"));
			String line=br.readLine();
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
			System.out.println(line);
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
