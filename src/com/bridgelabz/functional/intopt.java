/******************************************************************************
 *  
 *  Purpose:in this program we taking a,b,c value and perform integer operations.
 *
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class intopt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
		int a,b,c;
		Scanner number=new Scanner(System.in);
		System.out.println("please anter value a");
		a=number.nextInt();
		System.out.println("please anter value b");
		b=number.nextInt();
		System.out.println("please anter value c");
		c=number.nextInt();
		int result1=utility.abcnumber1(a,b,c);
		int result2=utility.abcnumber2(a,b,c);
		int result3=utility.abcnumber3(a,b,c);
		int result4=utility.abcnumber4(a,b,c);
		System.out.println("a+b*C="+result1);
		System.out.println("a*b+C="+result2);
		System.out.println("c+a/b="+result3);
		System.out.println("a%b+C="+result4);
		number.close();
		
	}

}
