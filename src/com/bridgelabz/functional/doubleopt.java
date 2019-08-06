/******************************************************************************
 *  
 *  Purpose: in this program we taking a,b,c value and perform double operations.
 *
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class doubleopt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
		Double a,b,c;
		Scanner number=new Scanner(System.in);
		System.out.println("please anter value a");
		a=number.nextDouble();
		System.out.println("please anter value b");
		b=number.nextDouble();
		System.out.println("please anter value c");
		c=number.nextDouble();
		Double result1=utility.abcndoubleumber1(a,b,c);
		Double result2=utility.abcdoublenumber2(a,b,c);
		Double result3=utility.abcdoublenumber3(a,b,c);
		Double result4=utility.abcdoublenumber4(a,b,c);
		System.out.println("a+b*C="+result1);
		System.out.println("a*b+C="+result2);
		System.out.println("c+a/b="+result3);
		System.out.println("a%b+C="+result4);
		number.close();
	}

}
