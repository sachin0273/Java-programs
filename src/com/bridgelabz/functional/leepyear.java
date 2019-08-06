/******************************************************************************
 *  
 *  Purpose: in this program we taking year as user input and print the is leap year or not.
 *
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class leepyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Utility utility = new Utility();
		Scanner isyear=new Scanner(System.in);
		int year;
		System.out.println("please enter your year");
		year=isyear.nextInt();
	    Utility.byleepyear(year);
		//System.out.println(result);
		isyear.close();

	}

}
