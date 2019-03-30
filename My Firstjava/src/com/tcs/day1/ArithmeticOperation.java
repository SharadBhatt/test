package com.tcs.day1;

public class ArithmeticOperation {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 =5;
		int num2 =7;
		
		Arithmetic myao = new Arithmetic();
		System.out.println("sum"+myao.addition(num1,num2) );
		System.out.println("sub"+myao.sub(num1,num2) );
		System.out.println("multi"+myao.multi(num1,num2) );
		System.out.println("divi"+myao.divi(num1,num2) );
	}

}
