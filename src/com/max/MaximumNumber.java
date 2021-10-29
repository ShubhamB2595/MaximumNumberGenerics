package com.max;

public class MaximumNumber {

	public static void main(String[] args) {
				
		System.out.println("Welcome to Test maximum 3 variables Program");
		
		//object for getting the maximum
		FindingMax max = new FindingMax();		
		max.findInt(15, 55, 20);
		
		max.findFloat(1.2f, 2.0f, 2.2f);
	}

}
