/******************************************************************************
 *  
 *  Purpose:in this program we perform various trigonometric functions.
 *  print the monthly payment  
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   2-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Trig {

	public static void main(String[] args) {
		double angle_in_degree;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your angle in degree");
		angle_in_degree=scanner.nextDouble();
		Utility.trig_function(angle_in_degree);
		scanner.close();
		
		

	}

}
