/******************************************************************************
 *  
 *  Purpose:in this program we takes input stake,trail,and goal and print out the Number of times won,
 *  Percent Win and Average number of bets made.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   3-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GamlingSimulator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    int stake,trails,goals;
	    System.out.println("please enter your stake");
	    stake=scanner.nextInt();
	    System.out.println("please enter your trails");
	    trails=scanner.nextInt();
	    System.out.println("please enter your goal");
	    goals=scanner.nextInt();
        Utility.Gambling(stake,trails,goals);
        scanner.close();
	}

}
