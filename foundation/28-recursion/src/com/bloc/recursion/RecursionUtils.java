package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/
		int max1 = numbers.get(0);
		if (numbers.size() > 1)
		{
			int max2 = findMaxRecursively(numbers.subList(1,numbers.size()));
		
			if (max2 > max1)
			{
				return max2;
			}
		}	
		
		return max1;
		
	}
}