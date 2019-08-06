/******************************************************************************
 *  
 *  Purpose:in this program we take a array and print out the secon largest and second smallest
 *  number in array.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   5-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Second_large_and_secondsmall {

	public static void main(String[] args) {
		int arr[]= {22,45,67,90,87,5,6,3,8};
		Utility.second_smallest(arr);
        Utility.second_largest(arr);
	}

}
