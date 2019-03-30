package com.tcs.day1;

public class Exceptiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
		/*	int num1=10;
			int num2=0;
			System.out.println(num1/num2);*/
			
			int num[]={10,20,30,40};{
				System.out.println(num[6]);
			}
			/*String name=null;
			System.out.println(name.length());*/
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("Can not divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException g) {
			System.out.println("out of bound");
		}
		catch (NullPointerException s) {
			System.out.println("n pointer exception");
		}
		catch (Exception e) {
			System.out.println("exception error");
		}
		finally {
			System.out.println("Error");
		}
		
	}

}
