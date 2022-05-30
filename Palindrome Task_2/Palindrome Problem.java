package navin.com;

import java.util.Scanner;

public class Adsaas 

{

	public static boolean isPalindrome(String s) {
	    String workingCopy = removeJunk(s);
	    String reversedCopy = reverse(workingCopy);
	    return reversedCopy.equalsIgnoreCase(workingCopy);
	  }
	
	  protected static String removeJunk(String string) {
	    int i, len = string.length();
	    StringBuffer dest = new StringBuffer(len);
	    char c;

	    for (i = (len - 1); i >= 0; i--) {
	      c = string.charAt(i);
	      if (Character.isLetterOrDigit(c)) {
	        dest.append(c);
	      }
	    }

	    return dest.toString();
	  }
	  protected static String reverse(String string) {
		    StringBuffer sb = new StringBuffer(string);

		    return sb.reverse().toString();
		  }
	  public static void main(String[] args) {
		  Scanner Scanner = new Scanner (System.in);	
		  String string=Scanner.nextLine();


	    if (isPalindrome(string)) {
	      System.out.println("True");
	    } else {
	      System.out.println("False");
	    }
	    Scanner.close();
	  }
	}