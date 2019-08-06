/******************************************************************************
 *  
 *  Purpose:in this program we read an integer as an Input, convert to Binary and 
 *   Swap nibbles and find the new number and Find the resultant number is the number is a power of 2.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   4-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class extendBinary {

	public static void main(String[] args) {
		Utility utility=new Utility();
		int decimalnumber;
		Scanner scanner=new Scanner(System.in);
		decimalnumber=scanner.nextInt();
		Utility.Binary(decimalnumber);
		int resultswap=utility.swapnibbles(decimalnumber);
		System.out.println("swaped nibbles value="+resultswap);
		utility.powerof2(resultswap);
		scanner.close();
		
		

	}

}
