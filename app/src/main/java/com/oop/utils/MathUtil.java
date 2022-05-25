package com.oop.utils;

public class MathUtil {

	// Static method 
	public static int sum(int... nums) {
		int total = 0;
		for( int num : nums ) {
			total += num;
		}

		return total;
	}
}
