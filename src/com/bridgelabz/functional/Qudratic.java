/******************************************************************************
 *  
 *  Purpose:in this program we find the roots of the equation a*x*x + b*x + c.
 *
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Qudratic {

	public static void main(String[] args) {
      double a,b,c;
      Scanner scanner=new Scanner(System.in);
      System.out.print("enter the value of a= ");
      a=scanner.nextDouble();
      System.out.print("enter the value of b= ");
      b=scanner.nextDouble();
      System.out.print("enter the value of c= ");
      c=scanner.nextDouble();
      Utility.qudratic(a,b,c);
      scanner.close();
	}

}
