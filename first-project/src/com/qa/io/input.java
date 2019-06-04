package com.qa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class input {
	
	public static void main(String[] args) throws IOException { 
			
	FileReader f = new FileReader("C:/Users/Admin/Desktop/inText.txt");
	BufferedReader bfdRead = new BufferedReader(f);
	String line = bfdRead.readLine();
	while (line !=null) {
		System.out.println(line);
		line = bfdRead.readLine();
		}
	FileWriter l = new FileWriter("C:/Users/Admin/Desktop/outText.txt");
	BufferedWriter bfdWrite = new BufferedWriter(l);
	bfdWrite.write("new line" + "\r\n");
	bfdWrite.write("yay!");
	bfdWrite.flush();
	bfdWrite.close();
			
	  }

 }
