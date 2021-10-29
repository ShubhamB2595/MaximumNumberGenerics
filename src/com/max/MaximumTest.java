package com.max;
/*
 * Generic class for finding the maximum
 */
public class MaximumTest <T extends Comparable<T>> {
	
	T num1, num2, num3, num4;

	//Constructor
	public MaximumTest(T num1, T num2, T num3, T num4) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	public T maximum() {
		return MaximumTest.maximum(num1, num2, num3, num4);
	}

	//finding largest of Comparable objects
	private static <T extends Comparable <T>> T maximum(T num1, T num2, T num3, T num4) {
		
		if( (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) && (num1.compareTo(num4) > 0) ) {
			System.out.println(num1 + " is maximum");
			return num1;
		}
		
		else if( (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) && (num2.compareTo(num4) > 0) ) {
			System.out.println(num2 + " is maximum");
			return num2;
		}
		else if( (num3.compareTo(num1) > 0 && num3.compareTo(num2) > 0) && (num3.compareTo(num4) > 0) ){
			System.out.println(num3 + " is maximum");
			return num3;
		}
		else {
			System.out.println(num4 + " is maximum");
			return num4;
		}
		
	}
	
	//method for testing the maximum 
	public static String testMaximum(String str1,String str2 ,String str3, String str4) {
	
		if( (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) && (str1.compareTo(str4) > 0) ) {
			System.out.println(str1 + " is maximum");
			return str1;
		}
		
		else if( (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0) && (str2.compareTo(str4) > 0) ) {
			System.out.println(str2 + " is maximum");
			return str2;
		}
		else if( (str3.compareTo(str1) > 0 && str3.compareTo(str2) > 0) && (str3.compareTo(str4) > 0) ){
			System.out.println(str3 + " is maximum");
			return str3;
		}
		else {
			System.out.println(str4 + " is maximum");
			return str4;
		}
	}
	
	//main method
	public static void main(String[] args) {
		
		MaximumTest.testMaximum("Shubham", "Anil", "Bhele", "Waman");
		new MaximumTest<Integer>(12, 13, 14, 11).maximum();
		
	}
	
	

}
