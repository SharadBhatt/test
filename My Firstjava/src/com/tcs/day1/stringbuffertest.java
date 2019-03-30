package com.tcs.day1;

public class stringbuffertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer mybuffer = new StringBuffer();
		mybuffer .append("sharad");
		mybuffer .append("Bhatt");
		System.out.println(mybuffer.toString());
		System.out.println(mybuffer.delete(0, 5));
		System.out.println(mybuffer.reverse());

	}

}
