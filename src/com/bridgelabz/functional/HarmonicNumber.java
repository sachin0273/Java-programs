/******************************************************************************
 *  
 *  Purpose:in this program we takes the command line input and print the Harmonic number.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   3-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		double harmonicnumber=Double.parseDouble(args[0]);
		Utility.Nthharmonicnumber(harmonicnumber);
		

	}

}
