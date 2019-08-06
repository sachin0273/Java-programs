/******************************************************************************
 *  
 *  Purpose:in this program we takes user input day,month and last two digit of year and print
 *  day of week.
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   1-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayofWeek {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int month,day,year;
		System.out.println("please enter your date");
		System.out.println(" enter your day ");
		day=scanner.nextInt();
		System.out.println(" enter your month");
		month=scanner.nextInt();
		System.out.println("please enter your last two digit of the year");
		year=scanner.nextInt();
		Utility.dayofweek(day,month,year);
		scanner.close();
		
		
		
		

	}

}
