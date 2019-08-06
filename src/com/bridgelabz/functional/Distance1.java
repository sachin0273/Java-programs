/******************************************************************************
 *  
 *  Purpose:in this program we takes two integer command­line arguments x
 *  and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Distance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		Utility.Distance(x,y);

	}

}