/******************************************************************************
 *  
 *  Purpose:in this program we prints five uniform random values between 0 and 1,
 *  their average value, and their minimum and maximum value.
 *
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   1-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double random1,random2,random3,random4,random5;
		random1=Math.random();
		random2=Math.random();
		random3=Math.random();
		random4=Math.random();
		random5=Math.random();
		Utility.randomStats(random1,random2,random3,random4,random5);
		

	}

}
