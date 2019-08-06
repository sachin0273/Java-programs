/******************************************************************************
 *  
 *  Purpose: in this program take the input as three names and print in reverse order.
 *
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class printthreenames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String firstname,secondname,thirdname,resultout;
    Scanner name=new Scanner(System.in);
    Utility utility = new Utility();
    System.out.println("please enter three names");
    System.out.println("please enter first name");
    firstname=name.next();
    System.out.println("please enter second name");
    secondname=name.next();
    System.out.println("please enter third name");
    thirdname=name.next();
    resultout = utility.reverseofNames(firstname,secondname,thirdname);
    System.out.println(resultout);
    
    name.close();
    
    
    
    
    
	}

}
