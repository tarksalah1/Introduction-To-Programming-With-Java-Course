package navin.com;

import java.util.Scanner;

public class Lkhjk {
	public static String convert(int x) {
		int base=10;
		boolean negative = false;
		String s = "";
		if (x == 0)
			return "0";
		negative = (x < 0);
		if (negative)
			x = -1 * x;
		while (x != 0) {
			s = (x % base) + s;
			x = x / base;
		}
		if (negative)
			s = "-" + s;
		return s;
	}

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner (System.in);
		int x =Scan.nextInt();
		System.out.println(convert(x));
		Scan.close();
	}

}
 