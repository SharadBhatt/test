package com.tcs.day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filestest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream os = new FileOutputStream("C:\\Users\\Public\\Documents\\Sharad\\selenium.txt");
		String str="I live in India and soon i will go to another";
		
		byte b[] =str.getBytes();
		os.write(b);
		os.close();
		
	}

}
