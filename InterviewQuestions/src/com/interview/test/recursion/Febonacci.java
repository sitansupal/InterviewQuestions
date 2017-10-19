package com.interview.test.recursion;

public class Febonacci {

	public static void main(String[] args) {
		Febonacci feb = new Febonacci();
		System.out.println(feb.getNthFebonacci(0));
		System.out.println(feb.getNthFebonacci(1));
		System.out.println(feb.getNthFebonacci(2));
		System.out.println(feb.getNthFebonacci(3));
		System.out.println(feb.getNthFebonacci(4));
		System.out.println(feb.getNthFebonacci(5));
		System.out.println(feb.getNthFebonacci(6));
		System.out.println(feb.getNthFebonacci(7));
		System.out.println(feb.getNthFebonacci(8));

	}
	
	public int getNthFebonacci(int nth) {
		return this.febonacci(nth, 1, 0);
	}
	
	private int febonacci(int nth, int previous, int current) {
		if(nth==0) {
			return current;
		}
		return febonacci(nth-1,current, current+previous);
	}

}
