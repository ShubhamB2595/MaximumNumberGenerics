package com.max;

public class FindingMax {

	//Constructor
	public FindingMax() {

	}
	
	//generic method to find the maximum from 3 input
	public <T extends Comparable <T>> void maximum(T num1, T num2, T num3) {
		
		if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
			System.out.println(num1 + " is maximum");
		}
		
		else if(num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
			System.out.println(num2 + " is maximum");
		}
		else {
			System.out.println(num3 + " is maximum");
		}
	}
}
