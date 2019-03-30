package com.tcs.day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Map<Integer, String> m = new HashMap<Integer,String>();
	Map<Integer, String> m = new TreeMap<Integer,String>();	
	m.put(467, "Rajnish");
	m.put(567, "Manisha");
	m.put(302, "Shahin");
	m.put(102, "Sharad");
	System.out.println(m);
	System.out.println(m.size());
	m.remove(302);
	System.out.println(m.size());
	System.out.println(m);
	System.out.println(m.get(102));
	System.out.println("--------");
	Set<Integer> keys =m.keySet();
	for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
		Integer int1 = (Integer) iterator.next();
		System.out.println(int1);
		System.out.println(m.get(int1));
	}
		
	}

}
