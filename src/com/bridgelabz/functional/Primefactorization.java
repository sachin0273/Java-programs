/******************************************************************************
 *  
 *  Purpose:in this program we takes user input number and print out the prime factorization of that number.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   5-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Primefactorization {

	public static void main(String[] args) {
		long number;
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextLong();
		Utility.Prime_factorization(number);
		scanner.close();
		

	}

}
