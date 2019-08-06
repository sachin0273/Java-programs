/******************************************************************************
 *  
 *  Purpose:in this program we take input from command line and print the table power of 2.(2^n)
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   3-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class powerOf2 {

	public static void main(String[] args) {
		int power_of_2=Integer.parseInt(args[0]);
		System.out.println("the power table is for 2^"+power_of_2);
		Utility.power_of_2_table(power_of_2);

	}

}
