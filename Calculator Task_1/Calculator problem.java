package com.navin;

import java.util.Scanner ;

public class Test {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner (System.in);
		
                System.out.println ("enter numbers x and y");
				float x= Scanner.nextFloat();
				float y= Scanner.nextFloat();
				System.out.println ("enter the operation");
				char str= Scanner.next().charAt(0);
				
				if (str == '+') {
					
					System.out.print("result =" + (x+y));
					System.out.print("\n"+"press any key to exit");
					System.exit(0);
				}
				if (str=='-') {
                    System.out.print("result =" + (x-y));
					System.out.print("\n"+"press any key to exit");
					System.exit(0);

				}
				if (str=='*') {
                    System.out.print("result =" + (x*y));
					System.out.print("\n"+"press any key to exit");
					System.exit(0);

				}
				if (str=='/') {
                    System.out.print("result =" + (x/y));
					System.out.print("\n"+"press any key to exit");
					System.exit(0);

				}
				if (str=='%') {
                    System.out.print("result =" + (x%y));
					System.out.print("\n"+"press any key to exit");
					System.exit(0);	

				}
				else {
					System.out.print("invalid input");
				}
                  Scanner.close ();
	            }


		
	}

				