package com.tcs.day1;

public class TwoDarraystest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]={{7,6,3,2},{8,3,7,5},{4,5,6,2},{10,20,30,90}};
		for (int row=0; row<num.length;row++ ){
			System.out.println();
			for(int col=0;col<num[row].length;col++){
			
				System.out.print(num[row][col]+"\t");

			}
		}
		
	}

}
