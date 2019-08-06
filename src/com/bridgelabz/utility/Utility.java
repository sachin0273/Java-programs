/******************************************************************************
 *  
 *  Purpose:it is Utility Class where logic of all other programs are written .
 *          This is done so most of the code can be reused
 *  @author  Sachin Shrikant Jadhav
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

public class Utility {
 /**
  * 
  * @param firstname: the first name
  * @param secondname: the second name
  * @param thirdname: the third name
  * @return result:   reverse of input three names
  */
	public String reverseofNames(String firstname, String secondname, String thirdname) {
		String result;
		return result="hi "+thirdname+","+secondname+","+"and "+firstname+".";
	}
  /****************************************integer operations***************************************
   * 
   * @param a: the first number
   * @param b: the second number
   * @param c: the third number
   * @return:  difrent integer operations
   */
	public int abcnumber1(int a, int b, int c) {
		return a+(b*c);
	}

	public int abcnumber2(int a, int b, int c) {
		return (a*b)+c;
	}

	public int abcnumber3(int a, int b, int c) {
		return c+(a/b);
	}

	public int abcnumber4(int a, int b, int c) {
		return (a%b)+c;
	}
/************************************************Double operations****************************************
 * 
 * @param a: the first number
 * @param b: the second number
 * @param c: the third number
 * @return  diffrent Double operations
 */
	public Double abcndoubleumber1(Double a, Double b, Double c) {
		return a+(b*c);
	}
	public Double abcdoublenumber2(Double a, Double b, Double c) {
		return (a*b)+c;
	}
	public Double abcdoublenumber3(Double a, Double b, Double c) {
		return c+(a/b);
	}
	public Double abcdoublenumber4(Double a, Double b, Double c) {
		return (a%b)+c;
	}
	/***********************************************leapyear.java**************************************
	 * 
	 * @param   year: user input year
	 * @return  input year leap or not
	 */
	public static void byleepyear(int year) {
	    if(year>=1582)
	    { 
	        if(year%400==0)
	        {
	             System.out.println("is a leap year");
	        }
	        else if (year%100==0)
	        {
	        	System.out.println("is not leap year");
	        }
	        else if(year%4==0)
	        {
	        	System.out.println("is leap year");
	        	
	        }
	        else {
	        	System.out.println("is leap year");
	        	
	        }
	    }   
	}
 /******************************************Spring session.java*********************************
  * 	
  * @param m: input month
  * @param d: input day
  * @return check the given input is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20),
  * ***********************************************************************************************/
	public static void Cheakmonthanddate(int m, int d) {
		if(m>=3&&d>=20||m>=4&&d<=30||m>=5&&d<=31)
		{
			System.out.println("True");
		}
	    else
		{
			System.out.println("True");
		}
	}
	/**********************************************Quadratic.java***************************
	 * 
	 * @param a:input number a
	 * @param b:input number b
	 * @param c:input number c
	 * @return  Finds the roots.
	 */
		public static void qudratic(double a, double b, double c) {
			double delta=(b*b)-(4*a*c);
			if (delta>0) {
			double root1=(-b + Math.sqrt(delta)/(2*a));
			double root2=(-b - Math.sqrt(delta)/(2*a));
			System.out.println("two destinct real root exists");
			System.out.println("root1="+root1);
			System.out.println("root2="+root2);
			
		}
			else if(delta==0){
				double root1=-b/(2*a);
				double root2=-b/(2*a);
				System.out.println("two equal real root exists");
				System.out.println("root1="+root1);
				System.out.println("root2="+root2);
			}
			else if(delta<0);
			double root1=-b/(2*a);
			double root2=-b/(2*a);
			double imaginary=Math.sqrt(-delta) / (2 * a);
			System.out.println("two destinct complex root exists");
			System.out.println("root1="+root1+"+"+imaginary);
			System.out.println("root2="+root2+"-"+imaginary);
			
			

	}
	/***********************************************Distance.java***********************************
	 * 
	 * @param x: first integer number from command line
	 * @param y: second integer number from command line
	 * @return finds the Euclidean distance from the point (x, y) to the origin (0, 0).
	 */



		public static void Distance(int x, int y) {
			double result;
			result=Math.sqrt(Math.pow(x, 2)+Math.pow(y,2 ));
			System.out.println(result);
			
		}
	 /************************************************SumOfTwoDice.java************************************
	  * 
	  * @param randomupto:dice range
	  * @param randomsum : adition of two random number.
	  * @return   prints the adition of two random number between 1 to 6
	  */




		public static void SumTwoRandumnum(int randomupto, int randomsum) {
			int a=1+(int)(Math.random()*randomupto);
			int b=1+(int)(Math.random()*randomupto);
			randomsum=a+b;
			System.out.println("Additon of two random dice number="+randomsum);
			
			
			
		}
		/*********************************Stat.java************************************************
		 * 
		 * @param random1:first random number
		 * @param random2: second random number
		 * @param random3: third random number
		 * @param random4:fourth random number
		 * @param random5: fifth random number
		 * @return prints the five random value,average value,max value,min value
		 */



		public static void randomStats(double random1, double random2, double random3, double random4, double random5) {
			double max=Math.max(random1,Math.max(random2,Math.max(random3,Math.max(random4,random5) ) ) );
			double min=Math.min(random1,Math.min(random2,Math.min(random3,Math.min(random4,random5) ) ) );
			double average=(random1+random2+random3+random4+random5)/5;
			System.out.println("random values\n"+random1+"\n"+random2+"\n"+random3+"\n"+random4+"\n"+random5);	
			System.out.println("average value="+average);
			System.out.println("maximum value="+max);
			System.out.println("minimum value="+min);
			
		}
		/*****************************************Windchill.java************************************
		 * 
		 * @param temp:       user input temprature(<50)
		 * @param wind_speed: user input windspeed(3-120)
		 * @return            prints the windchill for given input.
		 */



		public static void Windchill(double temp, double wind_speed) {
			double Wind_chill=35.74+0.6215*temp+((0.4275*temp)-35.75)*Math.pow(wind_speed, 0.16);
			System.out.println("windchill is="+Wind_chill);
			
		}
		/*************************************weekofday.java*****************************************
		 * 
		 * @param day: user input day of the year
		 * @param month: user input month of the year
		 * @param year:  user input last two digit of the year
		 * @return      in this prints the week of day from input date
		 */
		public static void dayofweek(int day, int month, int year) {
			int monthcode = 0;
			int leepyears=year/4;
			if(month==1||month==10) {
				monthcode=1;
			}
			else if(month==2||month==3||month==11) 
			{
				monthcode=4;
			}
			else if(month==4||month==7)
			{
				monthcode=0;
			}
			else if(month==9||month==12)
			{
				monthcode=6;
				
			}
			else if(month==5)
			{
				monthcode=2;
			}
			else if(month==6)
			{
				monthcode=5;
			}
			else if(month==8)
			{
				monthcode=3;
			}
			else
			{
				System.out.println("invalid input");
			}
		    int result=(year+leepyears+monthcode+day)%7;
		    if(result==1)
		    {
		    	System.out.println("sunday");
		    }
		    else if(result==2)
		    {
		    	System.out.println("monday");
		    }
		    else if(result==3)
		    {
		    	System.out.println("tusday");
		    }
		    else if(result==4)
		    {
		    System.out.println("wensday");
		    }
		    else if(result==5)
		    {
		    	System.out.println("thursday");	
		    }
		    else if(result==6)
		    {
		    	System.out.println("friday");	
		    }
		    else if(result==0)
		    {
		    	System.out.println("Saturday");
		    }
		    
			

			
			
			
		
	}
	/*****************************************tempraureconversion.java*******************************
	 * 	
	 * @param temp: input temprature
	 * @param a: integer input number for conversion selection
	 * @return prints the given temprature celcious to Fahrenhiet or vicevrsa.
	 * 
	 */
		public static void TempratureConversion(double temp, int a) {
			
			if(a==1)
			{
				double Fahrenhiet=(temp*9/5)+32;
				System.out.println("celcious to Fahrenhiet="+Fahrenhiet);
			}
			else if(a==2)
			{
				double celcious=(temp-32)*5/9;
				System.out.println("Fahrenhiet to celcious="+celcious);
				
			}
			else if(a==3)
			{
				double Fahrenhiet=(temp*9/5)+32;
				System.out.println("celcious to Fahrenhiet="+Fahrenhiet);
				double celcious=(temp-32)*5/9;
				System.out.println("Fahrenhiet to celcious="+celcious);
				
				
			}
			else
			{
				System.out.println("invalid input");
			}
			
		}
		/*********************************Carloan.java*********************************
		 * 
		 * @param irate           : intrest rate
		 * @param princeplepyment : principle payment amount
		 * @param installmentyear : years to pay
		 * @return                  prints the monthly payment.
		 */
		public static void Carloan(double irate, double princeplepyment, double installmentyear) {
			double n=12*installmentyear;
			double r=(irate/12)/100;
			double result=princeplepyment*r*(Math.pow((1+r),n)/(Math.pow((1+r),n)-1));
			System.out.print("monthly Emi is="+result);
			
			
		}
	/************************************Trig.java*********************************************
	 * 
	 * @param angle_in_degree 
	 * @return prints the trignometric function of given input angle.
	 */
		public static void trig_function(double angle_in_degree) {
			double result1=Math.toRadians(angle_in_degree);
			double result2=Math.sin(result1);
			double result3=Math.tan(result1);
			double result4=Math.cos(result1);
			System.out.println("to radians="+result1);
			System.out.println("sin ="+result2);
			System.out.println("tan ="+result3);
			System.out.println("cos ="+result4);
			
			
			
		}
		/***********************************************Flipcion.java**********************************
		 * 
		 * @param times: number of flips
		 * @return       prints the heads ans tails and percentage of heads and tails.
		 */
		public static void flipcoin(double times) {
			double headsCount=0;
			double tailsCount=0;
			for(int i=0;i<times;i++)
			{
			    double toss=Math.random();  
				if (toss<0.5)
			     {
				      System.out.println("head");
				      headsCount++;
			      }
			     else
			      {
			    	 System.out.println("tails");
				      tailsCount++;
			       }
			}		
			double headsPercent=(headsCount/times)*100;
			double tailsPercent=(tailsCount/times)*100;
			System.out.println("percentage of heads by flipping"+times+"times="+headsPercent);
			System.out.println("percentage of tails by flipping"+times+"times="+tailsPercent);
		}
		/************************************************powerof2.java**************************
		 * 
		 * @param power_of_2: input number which is power of two
		 * @return            prints the table of power of two.
		 */
		public static void power_of_2_table(int power_of_2) {
			for(int i=0;i<power_of_2;i++)
			{
				double result=Math.pow(2, i);
				int powerof2result=(int) result;
				System.out.println(powerof2result);
			}
			
		}
		/*****************************************harmaonicnumber.java**************************************
		 * 
		 * @param harmonicnumber:is nth  number
		 * @return               prints the harmonic number for givrn nth number.
		 */
		public static void Nthharmonicnumber(double harmonicnumber) {
			double harmonicresult=0;
			for(double i=1;i<=harmonicnumber;i++) {
		    harmonicresult= harmonicresult+(1/i);
			}
			System.out.println("nth harmonic number is "+harmonicresult);
		}
		/**********************************Sqrt.java****************************************
		 * 
		 * @param number: input number
		 * @param epsilon: 1e-15
		 * @return        print the roots of input number using newtons method.
		 */
		
		public static void Squareroot(double number, double epsilon, double t) {
			
			while (Math.abs(t - number/t) > epsilon*t) {
	            t = (number/t + t) / 2.0;
	        }
	        System.out.println("newtons method aproximate sqr root is="+t);
		}
		/****************************************Gamblersimulation.java**********************
		 * 
		 * @param stake 
		 * @param trails
		 * @param goals
		 * @return  prints the number of time wins and percentage of wins and average of bets.
		 */
		public static void Gambling(int stake, int trails, int goals) {
			int bets=0;
			int wins=0;
			for(int i=0;i<trails;i++)
			{   
				int yourcash=stake;
				while(yourcash>0&&yourcash<goals)
				{
					bets++;
					if(Math.random()<0.5)
					{
						yourcash++;
					}
					else
					{
						yourcash--;
					}
				}
				if(yourcash==goals)
				{
					wins++;
				}
				
			}
			System.out.println("number of times wins="+wins);
			System.out.println("percentage of win="+100.0*wins/trails);
			System.out.println("avg of bets="+0.1*bets/trails);
			
			
		}
		/**********************************************primenumber.java****************************
		 * 
		 * @param range: input a range for prime number
		 * @return      prints the prime number in given range.
		 */
		public static void Primenumber(int range) {
			int flag=0;
			for(int i=2;i<range;i++)
			{
				for(int r=2;r<i;r++)
				{
					if(i%r==0)
					   {
						flag=1;
						break;
					   }
					else
					   {  
						flag=0;
					   }
				}
				if(flag==0)
				{
					System.out.println(i);
				}
			}
			
		}
		/******************************************binary.java*****************************************
		 * 
		 * @param decimalnumber:input decimal number
		 * @return prints the binary number of given decimal number
		 */
		public static void decimaltobinary(int decimalnumber) {
			int power=1;
			while(power<=decimalnumber/2)
			{
			power=power*2;
			}
			while(power>0)
			{
				if(power>decimalnumber)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
					decimalnumber=decimalnumber-power;
				}
				power=power/2;
			}
			
			System.out.println();
		}
		/***********************************extendedbinary.java*******************************
		 * 
		 * @param decimalnumber
		 * @return prints the binary of decimalnumber
		 */
		public static void Binary(int decimalnumber) {
			int power=1;
			while(power<=decimalnumber/2)
			{
			power=power*2;
			}
			while(power>0)
			{
				if(power>decimalnumber)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
					decimalnumber=decimalnumber-power;
				}
				power=power/2;
			}
			
		   System.out.println();
		}
		/**
		 * 
		 * @param decimalnumber
		 * @return  swapping the nibbels and print the new number. 
		 */
		public int swapnibbles(int decimalnumber) {
			return ((decimalnumber&0xF0)>>4|(decimalnumber&0x0F)<<4);
		}
		/**
		 * 
		 * @param resultswap: swapping reult of binary
		 * @return check the newnumber is power of two or not.
		 */
		
		public int powerof2(int resultswap) {
			 if(resultswap==0)
				{
					System.out.println("this number is not power of two");
				}
				 while(resultswap!=1)
				 {
					 if(resultswap%2!=0)
					 {
						 System.out.println("this number is not power of two");
						 return resultswap;
					 }
					 else
					 {
						 resultswap=resultswap/2;
					 }
				 }
				 System.out.println("this number is power power of two");
				return resultswap;
			
			
		}
		/***********************************************sinx and cosx.java***************************
		 * 
		 * @param angle_x
		 * @return prints sin(angle_x) using Taylor series expansions.
		 */
		public static void SinOfangle_x(double angle_x) {
			   double result=0;
			   double sin_x=0;
		       angle_x=angle_x%(2*Math.PI);
		       result=angle_x-result;
		         for(double j=3;j<=20;j+=2)
		    	   {
					double fact=1;
		    		   for(double r=1;r<=j;r++)
		    		   {
		    			fact=fact*r;
		    			sin_x= Math.pow(angle_x, j)/fact;
		    			
		    		   }
		    		   if(j%4==1)
		    		   {
		    		   result=result+sin_x;
		    		   }
		    		   else if(j%4==3)
		    		   {
		    			 result=result-sin_x;
		    		   }
		    	   }
				System.out.println(result);
		       
		       
		}
		/**
		 * 
		 * @param angle_x
		 * @return prints cos(angle_x) using Taylor series expansions.
		 */
		public static void CosOfangle_x(double angle_x) {
			double result=1.0;
			   double cos_x=0;
		       angle_x=angle_x%(2*Math.PI);
		         for(double j=2;j<=20;j+=2)
		    	   {
					double fact=1;
		    		   for(double r=1;r<=j;r++)
		    		   {
		    			fact=fact*r;
		    			cos_x= Math.pow(angle_x, j)/fact;
		    			
		    		   }
		    		   if(j%4==0)
		    		   {
		    		   result=result+cos_x;
		    		   }
		    		   else if(j%4==2)
		    		   {
		    			 result=result-cos_x;
		    		   }
		    	   }
				System.out.println(result);
		       
			
		}
		/*************************************rolldie.java***************************************
		 * 
		 * @param times: number of throw of die
		 * @return      prints the which number between 1 and 6 fall maximum number
		 */
		public static void Rolldie(int times) {
			int die=6;
			int a=1,b=2,c=3,d=4,e=5;
			int count_1=0,count_2=0,count_3=0,count_4=0,count_5=0,count_6=0;
			for(int i=0;i<times;i++)
			{
				int number= 1+(int)(Math.random()*6);
				if(a==number)
				{
					count_1++;
				}
				else if(b==number)
				{
					count_2++;
				}
				else if(c==number)
				{
					count_3++;
				}
				else if(d==number)
				{
					count_4++;
				}
				else if(e==number)
				{
					count_5++;
				}
				else if(die==number)
				{
					count_6++;
				}
			}
			int max=Math.max(count_1, Math.max(count_2, Math.max(count_3, Math.max(count_4, Math.max(count_5, count_6)))));
			if(max==count_1)
			{
				System.out.println(" fall maximum number of times is.="+1);
			}
			else if(max==count_2)
			{
				System.out.println(" fall maximum number of times is.="+2);
			}
			else if(max==count_3)
			{
				System.out.println(" fall maximum number of times is.="+3);
			}
			else if(max==count_4)
			{
				System.out.println(" fall maximum number of times is.="+4);
			}
			else if(max==count_5)
			{
				System.out.println(" fall maximum number of times is.="+5);
			}
			else if(max==count_6)
			{
				System.out.println(" fall maximum number of times is.="+6);
			}
			
			
			
		}
		/*************************************************findtwicenumber.java**************************
		 * 
		 * @param arr:create array of 1 to 100.
		 * @return prints repeated number in array.
		 */
		public static void Findtwice(int[] arr) {
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				arr[count]=i;
				count++;
			}
			arr[21]=20;
			for(int i=0;i<arr.length;i++)
			{
			    for(int j=i+1;j<arr.length;j++)
			   {
			 	if(arr[i]==arr[j])
			 	{
			 		System.out.println("twice number found is="+arr[i]);
			 	}
			   }
			}
		}
		/**********************************secondsmall or large.java**********************
		 * 
		 * @param arr : input array.
		 * @return     prints the secondsmallest number in array.
		 */
		public static void second_smallest(int[] arr) {
			int first,second;
			first=second=Integer.MAX_VALUE;
			for (int i = 0; i < arr.length ; i++) 
	        { 
	            
	            if (arr[i] <first) 
	            { 
	                second = first; 
	                first = arr[i]; 
	            } 
	       
	            else if (arr[i] < second && arr[i] != first) 
	                second = arr[i]; 
	        } 
	          
	        
	     System.out.println("The second smallest element"+ 
	                                      " is "+ second); 
			
		}
		/**
		 * 
		 * @param arr : user inpu array
		 * @return     prints the second largest element in array
		 */
		public static void second_largest(int[] arr) {
			int first,second;
			first=second=Integer.MIN_VALUE;
			for (int i = 0; i < arr.length ; i++) 
	        { 
	            
	            if (arr[i] >first) 
	            { 
	                second = first; 
	                first = arr[i]; 
	            } 
	       
	            else if (arr[i]>second && arr[i] != first) 
	                second = arr[i]; 
	        } 
	          
	        
	     System.out.println("The second largest element"+ 
	                                      " is "+ second); 
			
		}
		/*********************************prime factorization*****************************
		 * 
		 * @param number:enter any number.
		 * @return       prints the prime factorization of given number.
		 */
	
		public static void Prime_factorization(long number) {
			for(long i= 2;i*i<=Long.MAX_VALUE;i++)
			{
				while(number%i==0)
				{
					System.out.print(i+" ");
					number=number/i;
				}
				
			}
			
		}
			
			
		
}


