package com.max;

public class FindingMax {

	//Constructor
	public FindingMax() {

	}
	
	//method to find the largest integer number 
	public void findInt(int num1, int num2, int num3) {
		
		if (num1 >= num2 && num1 >= num3) {
	         System.out.println( num1 + " is the maximum number.");
		}
	    else if (num2 >= num1 && num2 >= num3) {
	         System.out.println( num2 + " is the maximum number.");
	    }
	    else {
	         System.out.println( num3 + " is the maximum number.");
	    }
	}	
		
	//method to find the largest float number 
	public void findFloat(float num1, float num2, float num3) {
		
		if (num1 >= num2 && num1 >= num3) {
	         System.out.println( num1 + " is the maximum number.");
		}
		else if (num2 >= num1 && num2 >= num3) {
		     System.out.println( num2 + " is the maximum number.");
		}
		else {
			System.out.println( num3 + " is the maximum number.");
		}

	}
	
	//method to find the largest string  
	public void findString(String num1, String num2, String num3) {
			
		if((num1.compareToIgnoreCase(num2) >= 0) && (num1.compareToIgnoreCase(num3)) >= 0) {
			System.out.println( num1 + " is the maximum");
		}
		else if((num2.compareToIgnoreCase(num1) >= 0) && (num2.compareToIgnoreCase(num3)) >= 0) {
			System.out.println( num2 + " is the maximum");
		}
		else {
			System.out.println(num3 + " is the maximum");
		}
			
	}
		
}
