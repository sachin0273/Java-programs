/******************************************************************************
 *  
 *  Purpose:in this program we takes command line input as irate,princeplepyment,installmentyear and
 *  print the monthly payment  
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   2-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Carloan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double irate=Double.parseDouble(args[0]);
		double princeplepyment=Integer.parseInt(args[1]);
		double installmentyear=Integer.parseInt(args[2]);
		Utility.Carloan(irate,princeplepyment,installmentyear);
		
		
		
		
		
		

	}

}
