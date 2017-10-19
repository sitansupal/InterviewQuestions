package com.interview.test.recursion;

public class RecuersionOne {

	public static void main(String[] args) {
		output(5);
		System.out.println();
		output(6);
		System.out.println();
		output(7);
		System.out.println();
		output(8);
		System.out.println();
	}
	
	public static void output(int n) {
		if(n<=0) {
			return;
		}
		output(n-1);
		System.out.print(n);
		output(n-2);
	}

}
