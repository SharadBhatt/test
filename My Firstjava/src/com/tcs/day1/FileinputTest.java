package com.tcs.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Users\\Public\\Documents\\Sharad\\selenium.txt");
		int i=0;
		while((i=fi.read())!=-1){
			System.out.print((char)i);
		}
		fi.close();
	}

}
