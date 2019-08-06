/******************************************************************************
 *  
 *  Purpose:in this program we takes  the temperature in fahrenheit
 *  as input outputs the temperature in Celsius or viceversa.
 *  day of week.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   1-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TempratureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		Scanner scanner=new Scanner(System.in);
		int a;
		double temp;
		System.out.println("for celcius to fahrenite enter value 1 OR viceversa enter value 2");
		System.out.println("for both enter value 3 ");
		a=scanner.nextInt();
		System.out.println("for both enter respective temprature ");
		temp=scanner.nextDouble();
		Utility.TempratureConversion(temp,a);
		scanner.close();

	}

}
