/******************************************************************************
 *  
 *  Purpose:in this program we takes two double command­line arguments t
 *  and v and prints the wind chill.
 *
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   1-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class windchill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp=Double.parseDouble(args[0]);
		double wind_speed=Double.parseDouble(args[1]);
		Utility.Windchill(temp,wind_speed);
		
		

	}

}
