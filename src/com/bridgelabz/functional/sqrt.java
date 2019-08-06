/******************************************************************************
 *  
 *  Purpose:in this program we takes input from command line and prints the square root using Newton's method.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   3-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class sqrt {

	public static void main(String[] args) {
        double number=Double.parseDouble(args[0]);
        double epsilon = 1.0e-15; 
        double t = number;
        Utility.Squareroot(number,epsilon,t);
    }
	}
 