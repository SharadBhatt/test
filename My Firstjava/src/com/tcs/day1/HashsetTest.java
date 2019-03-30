package com.tcs.day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashsetTest {

	public static void main(String[] args) {
		
		//HashSet<String> name = new HashSet<String>();
		
		LinkedHashSet<String> name = new LinkedHashSet<String>();
		name.add("Sharad");
		name.add("Maddy");
		name.add("Amit");
		name.add("Sharad");
		System.out.println(name);
		System.out.println(name.size());
		name.remove("Sharad");
		System.out.println(name);
		System.out.println(name.size());
		System.out.println("_____");
		for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String name1 = (String) iterator.next();
			
			System.out.println(name1);
		}
		
	}

}
