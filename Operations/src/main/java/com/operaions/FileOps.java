package com.operaions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FileOps extends Thread{
	 private static final Logger log = LogManager.getLogger(FileOps.class);
	String data="";
	char arr[]=new char[2000];
public void run() {
	try {
		FileReader fr=new FileReader("D:\\javaProj\\demo.txt");
		BufferedReader input = new BufferedReader(fr);
		input.read(arr);
		data=new String(arr);
		//System.out.println(data);
		input.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	//String data2="hi welcome";
	for(int i=0;i<3;i++) {
	try {
			Thread.sleep(5000);
		FileWriter fw=new FileWriter("D:\\javaProj\\output2.txt");
		BufferedWriter output = new BufferedWriter(fw);
		//byte[] dataBytes = data.getBytes();
		//System.out.println(data2);
		for(int j=0;j<3;j++) {
		output.write(data);
		output.newLine();
		}
		log.info(data);
		//System.out.println(data);
		output.close();
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		FileOps obj=new FileOps();
		obj.start();
	}
}