/******************************************************************************
 *  
 *  Purpose:in this program  we takes two integer values m and d from the
 *command line and prints true if day d of month m is between March 20 (m = 3, d=20)
 *and June 20 (m = 6, d = 20), false otherwise.  
 *
 *  @author  Sachin Shrikant Jadhav.
 *  @version 1.0
 *  @since   1-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SpringSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int m=Integer.parseInt(args[0]);
       int d=Integer.parseInt(args[1]);
       Utility.Cheakmonthanddate(m,d);
       
	}

}
