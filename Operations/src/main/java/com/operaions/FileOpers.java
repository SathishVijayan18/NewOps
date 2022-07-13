package com.operaions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOpers {

	public static void main(String[] args) {
		FileOpers.method1();
	}
public static void method1() {
	FileWriter fw=null;
	String pathName="D:\\javaProj\\demo2.txt";
	String[] arr=new String[4];
	arr[0] = "request1";
	arr[1] = "request2";
	arr[2] = "request3";
	arr[3] = "request4";
	try {
		File file=new File(pathName);
		for(int i=0;i<arr.length;i++) {
			fw.write(arr[i]+"\n");
		}
		System.out.println(arr);
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(fw!=null) {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
