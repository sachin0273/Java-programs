/******************************************************************************
 *  
 *  Purpose:in this program we repeat the Die n times and print out the number 
 *  between 1 and 6 fall maximum number of times.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   4-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RollDie {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int times;
		System.out.println("please enter times to throw a die");
		times=scanner.nextInt();
		Utility.Rolldie(times);

	}

}
