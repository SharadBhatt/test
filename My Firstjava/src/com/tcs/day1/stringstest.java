package com.tcs.day1;

public class stringstest {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String fname="xyz";
			String lname="abc";
			String fullname =fname+" "+lname;
			String Sentence = "I live in India";
			System.out.println(fullname);
			System.out.println(fullname.length());
			System.out.println(fullname.charAt(6));
			System.out.println(fname.equals(lname));
			System.out.println(fname.equals("xyz"));
			System.out.println(fname.equals("XYz"));
			System.out.println(fname.equalsIgnoreCase("XYz"));
			System.out.println(fullname.startsWith("x"));
			System.out.println(fullname.startsWith("X"));
			System.out.println(fullname.startsWith("Y"));
			System.out.println(fullname.endsWith("c"));
			System.out.println(fullname.endsWith("C"));
			System.out.println(fullname.endsWith("b"));
			System.out.println(fullname.toUpperCase());
			System.out.println(fullname.toLowerCase());
			System.out.println(fullname.trim());
			System.out.println(fullname.substring(6));
			System.out.println(fullname.substring(4,5));
			System.out.println(fullname.replace(" ", "X"));
			System.out.println(Sentence.split(" ")[3]);

	}

}
