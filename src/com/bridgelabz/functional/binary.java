/******************************************************************************
 *  
 *  Purpose:in this program we prints the binary (base 2) representation of the decimal
 *  number typed as the command­line argument. It is based on decomposing the
 *  number into a sum of powers of 2.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   3-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class binary {

	public static void main(String[] args) {
		int decimalnumber=Integer.parseInt(args[0]);
		Utility.decimaltobinary(decimalnumber);

	}

}
