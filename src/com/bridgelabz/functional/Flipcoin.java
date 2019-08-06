/******************************************************************************
 *  
 *  Purpose:in this program we Flip the coin n times and finally print the percentage of Head vs Tail. 
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   2-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Flipcoin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double times;
		System.out.println("plese enter how many type you flip a coin");
		times=scanner.nextInt();
		Utility.flipcoin(times);
		scanner.close();
		

	}

}
