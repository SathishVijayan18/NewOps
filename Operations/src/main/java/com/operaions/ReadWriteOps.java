package com.operaions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ReadWriteOps extends Thread{
	byte[] array = new byte[100]; 
	 String data="";
	public void run()
	{
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}	
			try {
				InputStream input=new FileInputStream("D:\\javaProj\\demo.txt");
				input.read(array);
				data=new String(array);
				System.out.println(data);
			}catch(Exception e) {
			e.printStackTrace();
			}
			try {
				OutputStream out = new FileOutputStream("D:\\javaProj\\out.txt");
				 
				 for(int j=0;j<5;j++) {
					byte[] dataBytes = data.getBytes();
					 out.write(dataBytes);
				 //out.write(j);				
				 }
				 out.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//String req=s.nextLine();
		ReadWriteOps obj=new ReadWriteOps();
		obj.run();
		 
	}

}
