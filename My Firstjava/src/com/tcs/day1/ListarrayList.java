package com.tcs.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListarrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = new ArrayList<String>();
		name.add("sharad");
		name.add("pooja");
		name.add("Maddy");
		System.out.println(name.size());
		System.out.println(name.get(1));
		System.out.println(name);
		name.remove(1);
		System.out.println(name.size());
		System.out.println(name.get(1));
		System.out.println("---");
		for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String name1 = (String) iterator.next();
			System.out.println(name1);

	}

}
	}
