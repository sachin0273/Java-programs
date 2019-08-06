/******************************************************************************
 *  
 *  Purpose:in this program we find sin x and cos x using the
 *  Taylor series expansions
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   4-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sin_and_cos{

	public static void main(String[] args) {
		double angle_x;
		Scanner scanner=new Scanner(System.in);
		angle_x=scanner.nextDouble();
		Utility.SinOfangle_x(angle_x);
		Utility.CosOfangle_x(angle_x);
	    scanner.close();
		
		
	}

}
