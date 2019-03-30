package com.tcs.day1;

public class switchtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=12;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		 System.out.println("31 days");
			
			break;
		case 2:
		System.out.println("28 days");
			break;
		case 4:
		case 6:
		case 8:
		case 10: 	
			System.out.println("30 days");
		default:
			System.out.println("invalid month");
			break;
		}

	}

}
