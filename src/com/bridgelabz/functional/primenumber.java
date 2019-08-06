/******************************************************************************
 *  
 *  Purpose:in this program we take range input prints the prime number in that range.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   3-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class primenumber {

	public static void main(String[] args) {
		int range;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the range");
		range=scanner.nextInt();
		Utility.Primenumber(range);
		scanner.close();
		

	}

}
